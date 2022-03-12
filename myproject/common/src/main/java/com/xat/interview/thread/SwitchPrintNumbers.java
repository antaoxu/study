package com.xat.interview.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 淡漠
 */
public class SwitchPrintNumbers  {
    private static int count = 0;
    private static final int MAX_NUMBER = 100;
    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
         new Thread(new TurningRunner(),"偶数线程").start();
         Thread.sleep(1);
         new Thread(new TurningRunner(),"奇数线程").start();

    }
  static class TurningRunner implements Runnable {
     @Override
     public void run() {
         while (count <= MAX_NUMBER) {
             synchronized (lock) {
                 System.out.println(Thread.currentThread().getName() + "正在打印： " + count++);
                 lock.notifyAll();

                 if (count <= MAX_NUMBER) {
                     try {
                         lock.wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
         }
     }
 }
}
