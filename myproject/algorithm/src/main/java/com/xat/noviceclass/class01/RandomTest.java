package com.xat.noviceclass.class01;

/**
 * 随机数相关
 * @author xuantao
 */
public class RandomTest {
    public static void main(String[] args) {
        //Math.random()  等概率返回一个[0,1)上double类型的数,左闭右开
        //Math.random() * X 返回一个[0,X)上的double类型的数
        //(int)(Math.random() * X) 返回一个[0,X-1]上的int型的数
        int retryTime = 1000000;
        int arrSize = 8;
        int[] cur = new int[arrSize];
        for (int i = 0; i < retryTime; i++){
            //int curNumber = (int)(Math.random() * arrSize);
            int curNumber = g();
            cur[curNumber]++;
        }
        printArr(cur);
        int count = 0;
        for (int i = 0; i < retryTime; i++) {
            int num = f2();
            if (num == 0){
                count++;
            }
        }
        System.out.println((double) count/(double) retryTime);

        /**
         * 从1~5随机到1~7随机
         * 分析：先将1~5随机（f函数）变成0 1等概率发生器（f2函数）  ,再通过调用三次f2函数得到0~6等概率随机，再加1得到1~7等概率随机
         */

    }

    /**
     * 1~5等概率随机发生器
     * @return
     */
    public static int f(){
        return (int)(Math.random() * 5) + 1;
    }

    /**
     * 0 1 等概率发生器
     */
    public static int f2(){
        int ans = 0;
        do {
             ans = f();
        }while (ans==3);
        return ans<3?0:1;
    }

    /**
     * 0~6等概率随机
     */
    public static int g(){
        return (f2()<<2)+(f2()<<1)+(f2()<<0);
    }



    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"出现了"+arr[i]+"次");
        }
    }
}
