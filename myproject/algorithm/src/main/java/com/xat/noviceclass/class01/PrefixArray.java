package com.xat.noviceclass.class01;

/**
 * 前缀和数组 ：i位置的数就是从0~i位置上的数的累加和
 *
 * @author xuantao
 */
public class PrefixArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 56, 54, 42, 234, 3, 76, 766, 898, 32};
        System.out.println(printGoalNum(1, 3, arr));
    }

    private static int printGoalNum(int L, int R, int[] preSum) {
        return L == 0 ? preSum[R] : preSum[R] - preSum[L - 1];
    }

    public static int[] prefixArray(int[] arr) {
        int[] preSum = null;
        int N = arr.length;
        preSum = new int[N];
        preSum[0] = arr[0];
        for (int i = 1; i < N; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }
        return preSum;
    }
}
