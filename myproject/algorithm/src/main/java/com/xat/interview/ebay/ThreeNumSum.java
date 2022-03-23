package com.xat.interview.ebay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 淡漠
 */
public class ThreeNumSum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,-1,-2,-3,0};
        System.out.println(threeNumSum(arr));
    }
    public static List<List<Integer>> threeNumSum(int[] nums){
        //定义一个结果集，用于存放结果数据
        List<List<Integer>> res = new ArrayList<>();
        //如果数组为空或者长度小于三，直接返回空数组
        if (nums == null || nums.length < 3) return res;
        //将数组进行排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) break;
            //定义两个指针L，R
            int L = i + 1;
            int R = nums.length - 1;
            //去重
            if (nums[i] == nums[i+1]) continue;
            while (L < R){
                int sum = nums[i] + nums[L] +nums[R];
                if (sum == 0){
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (nums[L] == nums[L + 1]) L ++;
                    while (nums[R] == nums[R -1])  R --;
                    L++;
                    R--;
                }else if (sum < 0){
                    L++;
                }else if (sum > 0){
                    R--;
                }
            }
        }
        return res;
    }
}
