package com.xat.zuo.class05;

public class Validator {

    /**
     * 对数器的试用场景：
     * 你在网上找到了某个公司的面试题，你想了好久，感觉自己会做，但是你找不到在线测试
     * 你和朋友交流面试题，你想了好久，感觉自己会做，但是你找不到在线测试
     * 你在网上做笔试，但是前几个测试用例都过了，突然一个巨大无比数据量来了，结果你的代码报错了，
     * 如此大的数据量根本看不出哪错了，甚至有的根本不提示哪个例子错了，怎么debug？
     */

    //以排序为例子写一个对数器
    public static void main(String[] args) {
        //执行次数
        int count = 100;
        //随机数组的最大长度
        int length = 100;
        //随机数组元素的最大值
        int value = 1000;
        //随机生成一个数组
        for (int i = 0; i < count; i++){
            //随机一个数组长度
            int N = (int)(Math.random() * length);
            int[] arr = createArray(N,value);
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            selectSort(arr);
            printArray(arr);
            System.out.println();
            bubbleSort(arr1);
            printArray(arr1);
            System.out.println();
            insertSort(arr2);
            System.out.println();
            printArray(arr2);
            if (!sameArray(arr,arr1) || !sameArray(arr,arr2) || !sameArray(arr1,arr2)){
                System.out.println("测试失败！");
            }

        }

    }

    public static int[] createArray(int length, int value){
        int[] result = new int[length];
        for (int i = 0; i < length; i++){
            result[i] = (int) (Math.random() * value) + 1;
            //System.out.println(result[i]);
        }
        return result;
    }

    public static int[] copyArray(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static boolean sameArray(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                System.out.println("出错了！！！");
                return false;
            }
        }
        return true;
    }

    //🧘最基本的排序算法

    //1.选择排序
    //思路：在0～n-1范围上找到最小的数，然后把最小的值交换到前面
    public static void selectSort(int[] nums){
        //边界条件判断
        if (nums == null || nums.length < 2){
            return;
        }
        for(int i = 0; i < nums.length; i++){
            //定义最小值的位置索引
            int minIndex = i;
            for(int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[minIndex]){
                    swap(nums,j,minIndex);
                }
            }
        }
    }

    //2.冒泡排序
    //思路：
    //第一次：0～n-1 ，依次比较，谁大谁往后
    //第二次：0～n-2 , 依次比较，谁大谁往后
    //依此类推，直到最后有序
    public static void bubbleSort(int[] nums){
        //边界条件判断
        if (nums == null || nums.length < 2){
            return;
        }
        for (int end = nums.length - 1; end > 0; end--){
            for (int j = 0; j < end; j++){
                if (nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }

    }

    //3.插入排序
    //思路：
    //第一步：0～1上有序
    //第二步：0～2上有序
    //....
    //     ：0～n-1上有序
    //就像打牌一样，前面已经有序了，再来一张新的牌，把它插入现有的牌中，保持有序

    //第一个for循环，控制上面0～1，0～2，0～n-1有序
    public static void insertSort(int[] nums){
        //边界条件
        if (nums == null || nums.length < 2){
            return;
        }
        for(int i = 1; i < nums.length; i++){
            //第二层for循环，交换0～i之间的数的顺序，让其保持有序
            //跳出循环的条件：1）j < 0 了，已经找到最左边了，没数了
            //             2）nums[j] < nums[j+1]  j位置的数小于j+1位置的数，则说明 i= j + 1 前面的数已经有序了
            for(int j = i - 1; j >= 0 && nums[j] > nums[j+1]; j--){
                swap(nums,j,j+1);
            }

        }
    }


    private static void swap(int[] nums, int j, int minIndex) {
        int temp = nums[j];
        nums[j] = nums[minIndex];
        nums[minIndex] = temp;
    }

    private static void printArray(int[] nums){
        if (nums == null){
            System.out.println("数组为空");
            return;
        }
        System.out.print("[ ");
        for (int j : nums) {
            System.out.print(j + " ");
        }
        System.out.print("]");
    }


}
