package com.xat.interview.huawei;

import java.util.Scanner;

/**
 * @author 淡漠
 */
public class TheCharCountOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strings = scanner.nextLine().toLowerCase();
        String character = scanner.nextLine().toLowerCase();
        System.out.println(strings.length() - (strings.replaceAll(character, "").length()));
    }
}
