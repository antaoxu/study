package com.xat.interview.zhaoyin;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 淡漠
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 输入：[2,2,1]
 * 输出：1
 * 输入：[4,1,2,1,2]
 * 输出：4
 */
public class Main extends Father{
    /*public int singleNum(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null){
                map.put(arr[i],1);
            }else if (map.get(arr[i]) == 1){
                map.put(arr[i],2);
            }
        }
        //从map*/

    private String name;
    private int age;
    private static int num;

    public Main(String name, int age) {
        super(1);
        this.name = name;
        this.age = age;
    }
    public  int getNum(){
        Main main = new Main("aaa",23);
        return age;
    }
}
