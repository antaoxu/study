package com.xat.leetCode.editor.cn;

//给定两个数组 nums1 和 nums2 ，返回 它们的 交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
//
//
//
// 示例 1：
//
//
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
//
//
// 示例 2：
//
//
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4]
//解释：[4,9] 也是可通过的
//
//
//
//
// 提示：
//
//
// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000
//
//
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 909 👎 0

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays{
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
        solution.intersection(new int[]{1,2,3},new int[]{2,3});
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        /**
         * 求两个数组的交集，第一想法：
         * 方法1：暴力解法，两层for循环，额外定义一个数组存放结果，输入的两个数组有重复的就放到结果数组里，最后对数组去重。
         * 方法2：采用hash表，将第一个数组遍历存入一个hash表，循环第二个数组，
         * 如果hash表中有，就放到结果hash表中（能直接去重），最后将结果hash表转为目标数组。
         */
        //边界条件
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0 ){
            return new int[0];
        }
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])){
                res.add(nums2[j]);
            }
        }
        //1.set转换为数组
        /*int[] result = new int[res.size()];
        int j = 0;
        for (Integer integer : res){
            result[j++] = integer;
        }
        return result;*/
        //2.直接转
        return res.stream().mapToInt(x -> x).toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
