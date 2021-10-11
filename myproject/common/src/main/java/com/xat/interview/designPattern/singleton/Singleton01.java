package com.xat.interview.designPattern.singleton;

/**
 * @author xuantao
 * @date 2021/10/11
 * 设计模式-单例模式-饿汉式
 *类加载到内存之后，就会实例化一个单例，JVM保证线程安全（一个类在内存中只会加载一次，不会重复加载）
 * 简单实用，缺点就是不管用到与否，类加载时就完成实例化。
 *
 */
public class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01(){};

    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();
        System.out.println(singleton01==singleton02);

    }

}
