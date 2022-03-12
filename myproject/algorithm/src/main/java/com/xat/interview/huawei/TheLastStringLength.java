package com.xat.interview.huawei;

import java.util.Scanner;

/**
 * @author 淡漠
 */
public class TheLastStringLength {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        String target = strings[strings.length - 1];
        System.out.println(target.length());

    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = s.length() -1; i >=0; i--) {
            if (s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
