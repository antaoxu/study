package com.xat.interview.designPattern.singleton;

/**
 * @author xuantao
 * 单例模式，懒汉式-采用synchronized保证线程安全
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;

    private Singleton03(){};

    public static synchronized Singleton03 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
