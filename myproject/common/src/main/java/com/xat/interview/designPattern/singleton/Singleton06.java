package com.xat.interview.designPattern.singleton;

/**
 * @author xuantao
 * 采用枚举，不仅可以解决线程同步问题，还能防止反序列化
 */
public enum Singleton06 {
    INSTANCE;

    //业务方法
    public void m(){}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton06.INSTANCE.hashCode());
            }).start();
        }
    }
}
