package com.xat.leetCode.editor.cn;

//给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[
//b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
//
//
// 0 <= a, b, c, d < n
// a、b、c 和 d 互不相同
// nums[a] + nums[b] + nums[c] + nums[d] == target
//
//
// 你可以按 任意顺序 返回答案 。
//
//
//
// 示例 1：
//
//
//输入：nums = [1,0,-1,0,-2,2], target = 0
//输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//
//
// 示例 2：
//
//
//输入：nums = [2,2,2,2,2], target = 8
//输出：[[2,2,2,2]]
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 200
// -10⁹ <= nums[i] <= 10⁹
// -10⁹ <= target <= 10⁹
//
//
// Related Topics 数组 双指针 排序 👍 1921 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum{
    public static void main(String[] args) {
        Solution solution = new FourSum().new Solution();
        solution.fourSum(new int[]{1,-2,-5,-4,-3,3,3,5},-11
        );
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //相比于三数之和，多一层循环，同时判断条件相应调整
        List<List<Integer>> result = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        for(int a = 0; a < nums.length; a++){
            //nums[a]已经大于target了，再加后面比nums[a]大的数肯定不满足，直接return
            if(nums[a] > 0 && nums[a] > target){
                return result;
            }
            //对 a 去重
            if(a > 0 && nums[a] == nums[a-1]){
                continue;
            }
            //a固定以后，对b进行循环以及去重
            for(int b = a + 1; b < nums.length; b++){
                if(b > a + 1 && nums[b] == nums[b-1]){
                    continue;
                }
                int left = b + 1;
                int right = nums.length - 1;
                while(right > left){
                    long sum = (long)(nums[a] + nums[b] + nums[left] + nums[right]);
                    if(sum > target){
                        right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        result.add(Arrays.asList(nums[a],nums[b],nums[left],nums[right]));
                        while(right > left && nums[right] == nums[right-1]){
                            right--;
                        }
                        while(right > left && nums[left] == nums[left+1]){
                            left--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
