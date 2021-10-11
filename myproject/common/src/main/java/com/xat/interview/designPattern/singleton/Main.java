package com.xat.interview.designPattern.singleton;

import java.sql.SQLOutput;

/**
 * @author xuantao
 */
public class Main {
    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();
        System.out.println("第一种方式： "+(singleton01==singleton02));
    }



}
