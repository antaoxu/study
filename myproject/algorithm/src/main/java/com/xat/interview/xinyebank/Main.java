package com.xat.interview.xinyebank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 淡漠
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] s = sentence.split(" ");
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
        //System.out.println();

    }
}
