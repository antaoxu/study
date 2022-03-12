package com.xat.interview.huawei;

import java.util.Scanner;

/**
 * @author 淡漠
 */
public class TheStringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            while (s.length() >= 8){
                System.out.println(s.substring(0, 8));
                s = s.substring(8);
            }
            while (s.length() < 8 && s.length() > 0){
                s += "00000000";
                System.out.println(s.substring(0, 8));
            }
        }


    }
}
