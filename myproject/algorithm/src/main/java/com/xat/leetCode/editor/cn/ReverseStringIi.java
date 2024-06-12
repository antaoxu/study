package com.xat.leetCode.editor.cn;

//给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
//
//
// 如果剩余字符少于 k 个，则将剩余字符全部反转。
// 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
//
//
//
//
// 示例 1：
//
//
//输入：s = "abcdefg", k = 2
//输出："bacdfeg"
//
//
// 示例 2：
//
//
//输入：s = "abcd", k = 2
//输出："bacd"
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 10⁴
// s 仅由小写英文组成
// 1 <= k <= 10⁴
//
//
// Related Topics 双指针 字符串 👍 599 👎 0

public class ReverseStringIi{
    public static void main(String[] args) {
        Solution solution = new ReverseStringIi().new Solution();
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseStr(String s, int k) {
        //先把字符串转为数组
        char[] str = s.toCharArray();
        //每隔2k循环一次
        for(int i = 0; i < str.length; i += 2*k){
            //判断剩余字符是小于k还是介于k~2k之间
            int statrt = i;
            //交换的结束位置=起始位置 + k或者后面字符小于k时，直接到字符串最后一位
            int end = Math.min(str.length -1 , statrt + k -1);
            //交换
            while(end > statrt){
                swap(str,statrt,end);
                statrt++;
                end--;
            }
        }
        return new String(str);

    }

        public void swap(char[] str,int a,int b){
            char temp = str[b];
            str[b] = str[a];
            str[a] = temp;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

