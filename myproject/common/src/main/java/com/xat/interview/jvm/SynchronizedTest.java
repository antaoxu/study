package com.xat.interview.jvm;

/**
 * @author 淡漠
 */
public class SynchronizedTest {
    public synchronized void m(){
    }

    public void m1(){
        synchronized (this){
        }
    }
}
