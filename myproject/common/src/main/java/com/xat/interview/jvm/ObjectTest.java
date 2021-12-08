package com.xat.interview.jvm;

/**
 * @author 淡漠
 */
public class ObjectTest {
    //markword    -> 8字节
    //classpoint  ->4字节（压缩）
    int id;    // ->4字节
    String name;//->4字节（压缩）
    int age;    //->4字节

    byte b1;    //->1字节
    byte b2;    //->1字节

    Object o1;  //->4字节
    byte b3;    //->1字节

    //padding对齐  ->1字节

}
