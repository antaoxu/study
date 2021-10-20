package com.xat.interview.designPattern.singleton;



/**
 * @author xuantao
 */
public class Main {
    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();
        System.out.println("饿汉式单例模式： "+(singleton01==singleton02));
        System.out.println("==========================");
        Singleton06 singleton06 = Singleton06.getInstance();
        Singleton06 singleton07 = Singleton06.getInstance();
        System.out.println("枚举实现的单例模式： "+(singleton06==singleton07));
    }



}
