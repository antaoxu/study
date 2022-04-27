package com.xat.interview.huawei;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] split1 = in.nextLine().split(" ");
        int h = Integer.parseInt(split1[0]);
        String[] split2 = in.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : split2) {
            list.add(Integer.parseInt(s));
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer h1, Integer h2) {
                int d1 = h - h1;
                int d2 = h - h2;
                if ((d1 >0?d1:-d1)==(d2 >0?d2:-d2)){
                    return h1-h2;
                }else return (d1 >0?d1:-d1)-(d2 >0?d2:-d2);
            }
        });

        StringBuilder builder = new StringBuilder();
        for (Integer integer : list) {
            builder.append(integer).append(" ");
        }
        System.out.println(builder.toString().trim());

        in.close();
    }
}
