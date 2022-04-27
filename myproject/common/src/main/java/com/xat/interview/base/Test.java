package com.xat.interview.base;

import java.util.ArrayList;
import java.util.List;


public class Test {
    private static int num;

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("1","忘的",21));
        list.add(new User("2","倒海翻江",54));
        list.add(new User("3","发过",25));
        for (User user : list) {
            System.out.println(user);
        }
        System.out.println("==================");
        List<User> list1 = test(list);
        for (User integer : list1) {
            System.out.println(integer);
        }
    }

    public static List<User> test(List<User> list){
        for (User user : list) {
            user.setAge(89);
            user.setName("hahaha");
        }
        return list;
    }


    public static int test1(int a){
        if (a == 1) {
            int b = 0;
            try {
                b = 2 / a;
            } catch (Exception e) {
                System.out.println("catch 打印");
                return b;
            } finally {
                System.out.println("finally 打印");
                //return b;
            }
        }else {
            int b = 9;
            try {
                b = 2 / a;
            } catch (Exception e) {
                System.out.println("catch 打印");
                return b;
            } finally {
                System.out.println("finally 打印");
                //return b;
            }
        }
        return 4;

    }

}
