package com.xat.interview.jvm;

/**
 * @author 淡漠
 */
public class ClassLoader02 {
    public static void main(String[] args) {
        String bootStrap = System.getProperty("sun.boot.class.path").replace(";",System.lineSeparator());
        System.out.println(bootStrap);
        System.out.println("--------------------");
        String extLoader = System.getProperty("java.ext.dirs").replace(";",System.lineSeparator());
        System.out.println(extLoader);
        System.out.println("--------------------");
        String appLoader = System.getProperty("java.class.path").replace(";",System.lineSeparator());
        System.out.println(appLoader);

    }
}
