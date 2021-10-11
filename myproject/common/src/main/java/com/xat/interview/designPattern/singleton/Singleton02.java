package com.xat.interview.designPattern.singleton;

/**
 * @author xuantao
 * 单例模式-懒汉式
 * 用到时才加载,会有线程安全问题
 */
public class Singleton02 {
    private static Singleton02 INSTANCE;

    private Singleton02(){};

    public static Singleton02 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton02.getInstance().hashCode());
            }).start();
        }
    }
}
