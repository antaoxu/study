package com.xat.noviceclass.class01;

/**
 * 冒泡排序
 *
 * @author xuantao
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 9, 13, 5};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }

    /**
     * 0 - N-1
     * 0 - N-2
     * 两个数依次比较，谁大谁往后移，第一次遍历结束，最大值在最后一个，再从头开始遍历到倒数第二个，如此依次遍历
     *
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 - N-1
        // 0 - N-2
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            //0 1  1 2  2 3  3 4  N-2 N-1 之间是否需要交换
            for (int j = 0; j <= end-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            /*for (int j = 1; j <= end; j++) {
                if (arr[j] >= arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }*/
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
