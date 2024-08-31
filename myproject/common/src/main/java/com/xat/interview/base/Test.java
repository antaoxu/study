package com.xat.interview.base;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;


public class Test {



    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(2);
        list.add("A");
        list.add("B");
        list.ensureCapacity(4);
        list.add("C");
        list.add("D");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("B")) {
                list.remove(i);
            }
        }

        Iterator<String> iterator = list.iterator();

        /*while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
            if (value.equals("B")) {
                iterator.remove();
                //list.remove(value);  // 直接修改了集合的结构
            }
        }*/
    }

}
