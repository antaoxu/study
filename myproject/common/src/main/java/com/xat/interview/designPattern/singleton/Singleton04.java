package com.xat.interview.designPattern.singleton;

/**
 * @author xuantao
 * 单例模式-懒汉式-采用双重检查确保线程安全
 * 不加volatile多线程下可能会有问题，jvm指令重排时一个类的创建顺序可能会被打乱，从而产生线程不安全问题
 * 也就是当第一个线程进行访问时判断INSTANCE为空，然后进行加锁，加锁完以后再判断也为空，
 * 此时去创建INSTANCE实例，这时先把Singleton04类加载到内存，然后为其分配内存地址，赋予默认值；
 * 此时第二个线程进行访问，由于已经分配了内存地址且赋予了默认值，所以INSTANCE已经不为空，直接返回INSTANCE
 * 实例，但此时的INSTANCE实例是还未完全实例化成功的，这就造成了线程不安全问题。
 */
public class Singleton04 {
    private static volatile Singleton04 INSTANCE;

    private Singleton04(){};

    public static  Singleton04 getInstance(){
        if (INSTANCE==null){
            synchronized (Singleton04.class){
                if (INSTANCE==null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton04();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton04.getInstance().hashCode());
            }).start();
        }
    }
}
