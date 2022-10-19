package com.xat.interview.huawei;


import java.util.ArrayList;
import java.util.Scanner;

/** http://www.amoscloud.com/?p=2404
         小明今年升学到了小学1年纪
         来到新班级后，发现其他小朋友身高参差不齐
         然后就想基于各小朋友和自己的身高差，对他们进行排序
         请帮他实现排序
         输入描述
          第一行为正整数 h和n
          0<h<200 为小明的身高
          0<n<50 为新班级其他小朋友个数
          第二行为n各正整数
           h1 ~ hn分别是其他小朋友的身高
         取值范围0<hi<200
         且n个正整数各不相同

         输出描述
          输出排序结果，各正整数以空格分割
          和小明身高差绝对值最小的小朋友排在前面
          和小明身高差绝对值最大的小朋友排在后面
          如果两个小朋友和小明身高差一样
          则个子较小的小朋友排在前面

          示例一
          输入
          100 10
          95 96 97 98 99 101 102 103 104 105
          输出
           99 101 98 102 97 103 96 104 95 105

          说明  小明身高100
          班级学生10个  身高分别为 95 96 97 98 99 101 102 103 104 105

 * @author 淡漠
 * @date 2022-03-25
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] oneLine = sc.nextLine().trim().split(" ");
        int hight = Integer.parseInt(oneLine[0]);
        ArrayList<Integer> hights = praseIntList(sc.nextLine());
        hights.sort((h1, h2) -> {
            int d1 = hight - h1;
            int d2 = hight - h2;
            if ((d1>0?d1:-d1) == (d2>0?d2:-d2)){
                return h1 - h2;
            }else {
                return (d1>0?d1:-d1) - (d2>0?d2:-d2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Integer integer : hights) {
            sb.append(integer).append(" ");
        }
        System.out.println(sb.toString().trim());

    }
    private static ArrayList<Integer> praseIntList(String nextLine) {
        String[] temp = nextLine.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            list.add(Integer.parseInt(temp[i]));
        }
        return list;
    }


}
