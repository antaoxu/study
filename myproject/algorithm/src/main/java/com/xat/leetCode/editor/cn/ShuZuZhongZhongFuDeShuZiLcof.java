package com.xat.leetCode.editor.cn;

//找出数组中重复的数字。
//
//
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
//找出数组中任意一个重复的数字。
//
// 示例 1：
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3
//
//
//
//
// 限制：
//
// 2 <= n <= 100000
// Related Topics 数组 哈希表 排序 👍 525 👎 0

import java.util.HashSet;

public class ShuZuZhongZhongFuDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongZhongFuDeShuZiLcof().new Solution();
        int[] nums = { 3,3, 1, 0, 2, 5, 3};
        System.out.println(solution.findRepeatNumber(nums));

    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 方法一：hash表
     */
    /*public int findRepeatNumber(int[] nums) {
        int result = -1;
        HashSet<Integer> hashSet =new HashSet<Integer>();
        for(int num:nums){
            if (hashSet.contains(num)){
                result = num;
            }
            hashSet.add(num);
        }
        return result;

    }*/

    /**
     * 方法二：原地交换
     */

    public int findRepeatNumber(int[] nums){
        int i = 0;
        while (i<nums.length){
            if (nums[i] == i){
                i++;
                continue;
            }else if (nums[nums[i]] == nums[i]){
                return nums[i];
            }else {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;

            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
