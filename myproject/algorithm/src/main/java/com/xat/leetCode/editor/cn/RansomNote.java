package com.xat.leetCode.editor.cn;

//给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
//
// 如果可以，返回 true ；否则返回 false 。
//
// magazine 中的每个字符只能在 ransomNote 中使用一次。
//
//
//
// 示例 1：
//
//
//输入：ransomNote = "a", magazine = "b"
//输出：false
//
//
// 示例 2：
//
//
//输入：ransomNote = "aa", magazine = "ab"
//输出：false
//
//
// 示例 3：
//
//
//输入：ransomNote = "aa", magazine = "aab"
//输出：true
//
//
//
//
// 提示：
//
//
// 1 <= ransomNote.length, magazine.length <= 10⁵
// ransomNote 和 magazine 由小写英文字母组成
//
//
// Related Topics 哈希表 字符串 计数 👍 885 👎 0

public class RansomNote{
    public static void main(String[] args) {
        Solution solution = new RansomNote().new Solution();

    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //题目已经限定只有小写字母，所以本题目和字母异位词题目类似，
        //所以可采用一个hash数组来存放各个字母出现的次数
        int[] perNumCount = new int[26];
        for(int i = 0; i < magazine.length(); i++){
            perNumCount[magazine.charAt(i) - 'a']++;
        }
        for(int j = 0; j < ransomNote.length(); j++){
            perNumCount[ransomNote.charAt(j) - 'a']--;
        }
        //有小于0的，则说明不满足
        for(int k = 0; k < perNumCount.length; k++){
            if(perNumCount[k] < 0){
                return false;
            }
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
