package com.xat.interview.thread;

import java.util.concurrent.CompletableFuture;

/**
 * @author 淡漠
 */
public class AsynThread {
    public static void main(String[] args) {
        AsynThread.doOneThing();
        AsynThread.runAsync(() -> doOtherThing("123"));
        System.out.println("主线程执行结束");

    }

    private static void runAsync(Runnable runnable) {

        CompletableFuture.runAsync(()->{
            try {
                runnable.run();
            } finally {
            }
        });
    }

    private static void doOneThing() {
        System.out.println("主线程正在运行");
    }

    private static String doOtherThing(String name){
        System.out.println("异步线程正在执行");
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("异步线程执行结束");
        return "a";
    }
}
