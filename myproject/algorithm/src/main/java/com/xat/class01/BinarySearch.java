package com.xat.class01;

/**
 * @author 淡漠
 * @date 2021/11/04 00:37
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={8,7,3,4,5,6,7,8,4,3,2,1,9};
        int num = 2;
        //System.out.println(doesExist(arr, num));
        //System.out.println(leftIndex(arr,num));
        //System.out.println(rightIndex(arr,num));
        System.out.println(localMinimum(arr));
    }
    /**
     * 1.在一个有序数组int[] arr中，查找某一个数（num）是否存在
     * 思路：二分查找，定义一个变量 mid作为数组的中间位置，比较该位置上的数和目标数，
     * 若arr[mid]>num,则往左边继续二分
     * 若arr[mid]<num,则往右边继续二分
     * 直到找到目标值
     */
    public static boolean doesExist(int[] arr,int num){
        //如果数组为空，直接返回不存在
        if (arr == null||arr.length == 0){
            return false;
        }
        int L = 0;
        int R = arr.length - 1;
        //int mid = 0;
        //int mid = (L+R)/2;该种写法可能会导致溢出
        while (L < R){
            int mid = L + ((R-L)>>1);
            if (arr[mid] == num){
                System.out.println("该数组中存在:"+num);
                return true;
            }else if (arr[mid] > num){
                R = mid -1;
            }else {
                L = mid + 1;
            }
        }
        return arr[L] == num;
    }

    /**
     * 2.在一个有序数组中，找出>=某个数num最左的位置
     * 思路：二分查找
     */
    public static int leftIndex(int[] arr,int num){
        if (arr == null || arr.length == 0){
            return -1;
        }
        int L = 0;
        int R = arr.length-1;
        int index = -1;
        while (L <= R){
            int mid = L + ((R - L)>>1);
            if (arr[mid] >= num){
                R = mid - 1;
                //用index变量记录mid的位置，若while里匹配不到，则返回-1
                index = mid;
            }else {
                L = mid + 1;
            }
        }
        System.out.println("大于等于"+num+"最左的位置为："+index+" 该位置上的数为："+arr[index]);
        return index;
    }

    /**
     * 3.在一个有序数组中，找出<=某个数num最右的位置
     * 思路：二分查找，同上一个一样
     */
    public static int rightIndex(int[] arr,int num){
        if (arr == null || arr.length == 0){
            return -1;
        }
        int L = 0;
        int R = arr.length - 1;
        int index = -1;
        while (L <= R){
            int mid = L + ((R - L)>>1);
            if (arr[mid] <= num){
                L = mid + 1;
                index = mid;
            }else {
                R = mid - 1;
            }
        }
        System.out.println("小于等于"+num+"最右的位置为："+index+" 该位置上的数为："+arr[index]);
        return index;
    }

    /**
     * 4.局部最小，给定一个无序数组，相邻的两个数都不相等，请找出一个局部最小值
     * 定义：一个长度为N数组arr中，
     * 若arr[0]< arr[1],则arr[0]为局部最小；
     * 若arr[N-1]<arr[N-2],则arr[N-1]为局部最小
     * 若在数组中间位置，且满足arr[i-1]>arr[i]<arr[i+1],则arr[i]为局部最小
     * 思路：
     *     1.若数组开头或结尾满足局部最小，则可直接返回
     *     2.若开头结尾都不满足，此时有：arr[0]> arr[1]  arr[N-1]>arr[N-2],
     *       也就是数组开头呈下降趋势，结尾呈上升趋势，那么在数组中则必然存在局部最小（想象高数中的极值）
     *     3.满足2中的情况，我们可用二分查找的思路来解决
     *
     */
    public static int localMinimum(int[] arr){
        int N = arr.length;
        if (arr == null || N == 0){
            return -1;
        }
        if (arr[0] < arr[1]){
            return arr[0];
        }
        if (arr[N-1] < arr[N-2]){
            return arr[N-1];
        }
        //上面两种情况已经排除开头和结尾是局部最小的情况，所以L从1位置开始，R从arr.length-2开始
        int L = 1;
        int R = arr.length - 2;

        while (L < R){
            int mid = L + ((R - L)>>1);
            //当arr[mid] > arr[mid-1]时，数组开头呈现下降趋势，mid-1到mid之间为上升趋势，
            //则在0~mid之间必然存在局部最小，mid右侧也可能存在，但可忽略，所以我们继续向mid左边进行二分
            if (arr[mid] > arr[mid-1]){
                R = mid - 1;
            //当arr[mid] > arr[mid+1]时，数组开头呈现下降趋势，mid-1到mid之间也为下降趋势
            //此时0~mid之间可能存在局部最小，但可忽略，向mid右边继续二分查找
            }else if (arr[mid] > arr[mid+1]){
                L = mid + 1;
            }else {
                //此种情况既不满足arr[mid] > arr[mid-1]，也不满足arr[mid] > arr[mid+1]
                //也就是arr[mid-1]>arr[mid]<arr[mid+1],arr[mid]就是局部最小，直接返回
                return arr[mid];
            }
        }
        return arr[L];
    }
}
