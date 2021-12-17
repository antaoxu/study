package com.xat.class02;

import java.util.Arrays;

/**
 * @author xuantao
 */
public class MainSort {
    public static void main(String[] args) {
        int maxLength = 100;
        int maxValue = 100;
        int testTime = 50000;
        boolean success = true;
        for (int i = 0; i < testTime; i++) {
            int[] randomArray = generateRandomArray(maxLength, maxValue);
            int[] copyArray = copyArray(randomArray);

            //insertSort(randomArray);
            //selectSort(randomArray);
            bubbbleSort(randomArray);
            comparator(copyArray);
            if (!isEqual(randomArray, copyArray)) {
                success = false;
                break;
            }
        }
        System.out.println(success ? "测试成功" : "测试失败");
        int[] arr = generateRandomArray(maxLength, maxValue);
        printArray(arr);
        insertSort(arr);
        printArray(arr);

    }

    /**
     * 插入排序：从第二个数开始，依次与它前面的数对比，如果比前一个数小，则交换；
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minNumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minNumIndex = arr[j] < arr[minNumIndex] ? j : minNumIndex;
            }
            swap(arr, i, minNumIndex);
        }
    }

    public static void bubbbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = N-1; end > 0; end--) {
            for (int i = 0; i < end; i++){
                if (arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * 随机生成一个数组
     *
     * @param maxLength
     * @param maxValue
     * @return
     */
    public static int[] generateRandomArray(int maxLength, int maxValue) {
        int[] result = new int[(int) (Math.random() * (maxLength + 1))];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * (maxValue + 1))
                    - (int) (Math.random() * (maxValue));
        }
        return result;
    }

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 拷贝数组
     *
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    /**
     * 判断两个数组是否一样
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || arr1 != null && arr2 == null) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 交换数组中的两个数
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
