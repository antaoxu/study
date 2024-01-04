package com.xat.servlet;

import com.alibaba.fastjson.JSON;
import com.xat.Hello;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.*;

public class MyServlet {
    public static void main(String[] args) throws IllegalAccessException {
        RejectedExecutionHandler handler = new MyIgnorePolicy();
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 5, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),handler);
        // 执行任务
        for (int i = 0; i < 20; i++) {
            final int index = i;
            threadPool.execute(() -> {
                System.out.println(index + " 被执行,线程名:" + Thread.currentThread().getName()+" ");
                System.out.println("核心线程数："+ threadPool.getCorePoolSize()+" "
                        +"最大线程数："+ threadPool.getMaximumPoolSize()+" "
                        +"活跃数量："+ threadPool.getActiveCount()+" "
                        +"队列大小："+ threadPool.getQueue().size()+" "
                        +"任务数量：" + threadPool.getTaskCount()
                );
                try {
                    Thread.sleep(900000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
        }
        /*Hello hello = new Hello();
        hello.setName("123");
        if (hello.getAmount() == null){
            System.out.println("======");
        }
        System.out.println(JSON.toJSONString(hello));
        setPropertis(hello,new BigDecimal("0"));
        System.out.println(JSON.toJSONString(hello));*/
    }

    static class MyIgnorePolicy implements RejectedExecutionHandler{

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(r.toString() + " was rejected");
        }
    }

    public static<E,T> void setPropertis(E e, T t) throws IllegalAccessException {
        Class<?> aclass = e.getClass();
        Field[] fields = aclass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getType().equals(t.getClass()) && field.get(e) == null){
                field.set(e,t);
            }
        }
    }







}
