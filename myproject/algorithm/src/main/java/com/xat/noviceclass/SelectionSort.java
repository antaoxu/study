package com.xat.noviceclass;

/**
 * 选择排序
 *
 * @author xuantao
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 7, 9, 13, 5};
        printArr(arr);
        selectSort(arr);
        printArr(arr);
    }

    private static void selectSort(int[] arr) {
        if (arr == null || arr.length < 0) {
            return;
        }
        // 0 - N-1
        // 1 - N-1
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minStep = i;
            for (int j = i+1; j < N; j++) {
               minStep = arr[minStep]>arr[j]?j:minStep;
            }
            swap(arr,minStep,i);
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
