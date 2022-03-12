package com.xat;

/**
 * @author 淡漠
 */
public class Hello {
    public static void main(String[] args) {
        int L =1;
        int R = 23;
        int x =2;
        long start = System.currentTimeMillis();
        countNum(1, 30, 3);
        long time = System.currentTimeMillis() - start;
        System.out.println(time);
        System.out.println(countNum(1, 100, 0));
    }
    public static int countNum(int L,int R ,int x){
        int ans = 0;
        for (int i = L;i<=R;i++){
            int j = i;
            while (j != 0) {
                if (j % 10 == x) {
                    ans++;
                }
                j = j/10;
            }
        }
        return ans;
    }
}
