package com.xat.leetCode.editor.cn;

//给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j !=
//k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
//
// 你返回所有和为 0 且不重复的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
//
//
// 示例 1：
//
//
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//解释：
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
//不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
//注意，输出的顺序和三元组的顺序并不重要。
//
//
// 示例 2：
//
//
//输入：nums = [0,1,1]
//输出：[]
//解释：唯一可能的三元组和不为 0 。
//
//
// 示例 3：
//
//
//输入：nums = [0,0,0]
//输出：[[0,0,0]]
//解释：唯一可能的三元组和为 0 。
//
//
//
//
// 提示：
//
//
// 3 <= nums.length <= 3000
// -10⁵ <= nums[i] <= 10⁵
//
//
// Related Topics 数组 双指针 排序 👍 6900 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();

    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //思考：不能出现重复的三元组，如果采用hashmap来处理，最终需要对三元组去重，较为复杂
        //可以双指针使用双指针，在遍历的过程中进行去重，但前提是得先将数组排序
        //步骤：1.对数组从小到大排序;
        //      2.对i去重，i>0时，如果nums[i] = nums[i-1]，则跳过i;(不能是nums[i] = nums[i+1])
        //        这样会跳过（-1，-1，2）这样的数据，只有前一个处理过了，当前i才能跳过，而不能跳过i+个
        //      3.定义left和right指针  left初始值为i+1，right初始值为nums.length -1;
        //      4.对left和right去重，如果nums[left] = nums[left+1],则left++ ,
        //        同理，如果nums[right] = nums[right-1],则right--
        //      5.将符合条件的结果返回
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            //因为已经排过序了，所以如果三数的第一个数就大于0，则直接返回结果
            if(nums[i] > 0){
                return result;
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            //注意条件不能是等于，等于的话三元组会重复（同一一个数用了两次）
            while(right > left){
                //三数之和小于0，则left++
                if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                //三数之和小于0，则right--
                else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
                else{
                    //三数之和为0的时候，将三元组加入结果集
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //接下来对left和right去重
                    while(right > left && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(right > left && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }

            }

        }
        return result;

    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
