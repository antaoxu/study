package com.xat.leetCode.editor.cn;

//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
//
//
//
// 示例 1:
//
//
//输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
//
//输入: s = "rat", t = "car"
//输出: false
//
//
//
// 提示:
//
//
// 1 <= s.length, t.length <= 5 * 10⁴
// s 和 t 仅包含小写字母
//
//
//
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
//
// Related Topics 哈希表 字符串 排序 👍 921 👎 0

public class ValidAnagram{
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();

    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        //用hash数组实现，先遍历一个字符串，将每个字母出现的次数放到数组
        //接着遍历第二个字符串，如果字符相同，则次数减1
        //最后看hash数组，如果有不为0的位置，则说明某个字符在两个字符串中出现的次数不一样
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 97]++;
        }
        for (int j = 0; j < t.length(); j++){
            hash[t.charAt(j) - 97]--;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0){
                return false;
            }
        }
        return true;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
