package com.xat.interview.jvm;

import com.xat.interview.designPattern.strategy.test.MyTest;

/**
 * @author 淡漠
 */
public class ClassLoader01 {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(MyTest.class.getClassLoader());
        System.out.println(MyTest.class.getClassLoader().getClass().getClassLoader());
    }
}
