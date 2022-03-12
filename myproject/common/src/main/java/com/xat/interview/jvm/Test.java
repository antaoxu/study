package com.xat.interview.jvm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 淡漠
 */
public class Test {
    public static void main(String[] args) {
        String s = "asdfsf";
        System.out.println(method(s));

    }

public static int method(String s){
        if(s.length() == 0){
            return 0;
        }
        int end = 0;
        int ans = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int start = 0;end < s.length(); end++){
            if(map.containsKey((s.charAt(end)))){
                start = Math.max(start,map.get(s.charAt(end)));
            }
            map.put(s.charAt(end),end + 1);
            ans = Math.max(ans,end - start + 1);
        }
        return ans;
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }




}
