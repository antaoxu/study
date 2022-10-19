package com.xat.noviceclass.class01;

/**
 * 插入排序
 *
 * @author xuantao
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 9, 13, 5};
        printArr(arr);
        insertSort(arr);
        printArr(arr);
    }

    /**
     * 首先0-0上已经有序，从1开始，依次保证 0-1 0-2 0-3 0-4 0-N-1 0-N 上有序
     * 也就是从i位置开始依次向左比较，小的放前面，大的放后面
     *
     * @param arr
     */
    private static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            //1~0 2~0 3~0 4~0 ...N-1~0上有序
            /*for (int start = end; start > 0; start--) {
                if (arr[start] < arr[start - 1]) {
                    swap(arr, start, start - 1);
                }
            }*/
            while (end-1>=0 && arr[end] < arr[end - 1]){
                swap(arr, end, end - 1);
                end --;
            }
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
