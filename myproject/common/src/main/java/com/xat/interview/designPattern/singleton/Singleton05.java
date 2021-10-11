package com.xat.interview.designPattern.singleton;

/**
 * @author xuantao
 */
public class Singleton05 {
    private Singleton05(){};

    /**
     * 静态内部类,外部类加载时静态内部类是不会被加载的
     */
    private static class Singleton05Holder{
        private  final static Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance(){
        return Singleton05Holder.INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton05.getInstance().hashCode());
            }).start();
        }
    }

}
