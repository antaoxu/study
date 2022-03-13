package com.xat.interview.xinyebank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @author 淡漠
 */
public class TheMaxLengthWord {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param words string字符串一维数组
     * @return string字符串
     */
    public String longestWord (String[] words) {
        //将字符串数组按字符串长度进行排序，长度相同的按字典序排序
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(words));
        //重写一个比较器比较字符串长度
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) return o2.compareTo(o1);
                return o1.length() - o2.length();
            }
        });
        for (int length = words.length -1; length >= 0; length--) {
            if (validate(words[length],hashSet)){
                return words[length];
            }
        }
        return "";

    }

    private boolean validate(String word, HashSet<String> hashSet) {
        if (word.length() == 0){
            return true;
        }
        for (int i = 1; i <= word.length(); i++) {
            if (hashSet.contains(word.substring(0,i))){
                //对子字符串递归进行匹配校验
                if (validate(word.substring(i),hashSet)){
                    return true;
                }
            }
        }
        return false;
    }
}
