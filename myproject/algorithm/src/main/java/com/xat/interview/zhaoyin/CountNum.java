package com.xat.interview.zhaoyin;

/**
 * @author 淡漠
 * 统计某个给定范围【L,R】的所有整数中，数字x出现的次数，x的范围为[0,9]，L的范围[1,99999]
 * eg:L=1,R=20,X=2,则数字2在数字2中出现一次，在数字12中出现一次，在数字20中出现一次，一共出现3次,
 * 所以返回值为3
 */
public class CountNum {

    public static int countNums(int L,int R,int x){
        int count = 0;
        for (int i = L; i <= R; i++){
            int j = i;
            while (j != 0){
                if (i % 10 == x){
                    count++;
                }
                j = j/10;
            }
        }
        return count;
    }
}
