package com.xat.zuo.class01;

public class BinarySystem {


    /*
     *二进制相关
     * 1.二进制与十进制的转换
     * 2.二进制与十六进制的转换
     * 3.二进制下正负数的表示
     * 4.二进制中正负数间如何转换
     * 5.如何打印一个二进制数
     * 6.二进制的一些运算
     */


    //二进制下负数转正数
    public static int nagToPos(int num){
        //对负数先减1然后取反
        return ~(num - 1);

    }

    //二进制下正数转负数
    public static int posToNag(int num){
        //对正数先取反再加1
        return ~num + 1;

    }

    //打印二进制数
    public static void printBinaryNum(int num){
        for (int i = 31; i >=0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");

        }
    }

    public static void main(String[] args) {

        int a = 0b0001;
        int b = 0b0000;
        printBinaryNum(a & b);
        System.out.println();

        printBinaryNum(a | b);
        System.out.println();

        printBinaryNum(a ^ b);
        System.out.println();


    }

}
