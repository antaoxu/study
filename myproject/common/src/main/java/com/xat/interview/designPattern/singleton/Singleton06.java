package com.xat.interview.designPattern.singleton;

/**
 * @author xuantao
 * 采用枚举，不仅可以解决线程同步问题，还能防止反序列化,
 * 之前的方式都可以通过反射来访问单例的私有构造方法，从而构造出多个实例,
 * 而枚举是没有构造方法的，无法通过反射构造出多个实例
 */
public enum Singleton06 {
    INSTANCE;


    public static Singleton06 getInstance(){
        return INSTANCE;
    }

    //业务方法
    public void m(){}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton06.getInstance());
            }).start();
        }
    }
}
