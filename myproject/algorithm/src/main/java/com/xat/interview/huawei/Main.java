package com.xat.interview.huawei;

import java.util.*;

/**
 * @author 淡漠
 * 滑动窗口求最大值之和
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] array = toIntList(sc.nextLine());
        int M = Integer.parseInt(sc.nextLine());
        System.out.println(maxNum(array, N, M));

    }

    private static int[] toIntList(String nextLine) {
        String[] arr = nextLine.split(" ");
        int[] target = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            target[i] = Integer.parseInt(arr[i]);
        }
        return target;
    }

    public static int maxNum(int[] arr,int N,int M){
        int count = N - M;
        int maxNum = 0;
        for (int i = 0; i <= count; i++) {
            int sum = 0;
            for (int j = i; j < i + M; j++){
                sum += arr[j];
            }
            maxNum = Math.max(maxNum,sum);
        }
        return maxNum;
    }
}
