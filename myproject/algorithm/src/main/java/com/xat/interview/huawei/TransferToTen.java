package com.xat.interview.huawei;

import java.util.Scanner;

/**
 * @author 淡漠
 * 进制转换，输入一个十六进制数，转换为十进制输出，不同组的测试用例用\n隔开。
 */
public class TransferToTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String s1 = s.substring(2);
            int num = Integer.valueOf(s1,16);
            System.out.println(num);

        }
    }
}
