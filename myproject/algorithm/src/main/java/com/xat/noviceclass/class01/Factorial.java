package com.xat.noviceclass.class01;

/**
 * 阶乘
 * @author xuantao
 */
public class Factorial {
    /**
     * 求1~N的阶乘之和  1!+2!+3！+...+N!
     */
    public static int factorial(int N){
        int ans = 0;
        int cur = 1;
        for (int i = 1; i <= N; i++) {
            cur = cur * i;
            ans = ans + cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
