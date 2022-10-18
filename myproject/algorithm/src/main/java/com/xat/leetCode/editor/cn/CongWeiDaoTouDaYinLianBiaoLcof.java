package com.xat.leetCode.editor.cn;

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//
//
//
// 示例 1：
//
// 输入：head = [1,3,2]
//输出：[2,3,1]
//
//
//
// 限制：
//
// 0 <= 链表长度 <= 10000
// Related Topics 栈 递归 链表 双指针 👍 197 👎 0

import java.util.Arrays;

/**
 * @author xuantao
 */
public class CongWeiDaoTouDaYinLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        for (int i : solution.reversePrint(node1)) {
            System.out.println(i);
        }
    }

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public static class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null){
            current = current.next;
            size++;
        }
        int[] result = new int[size];
        current = head;
        while (current != null && size > 0){
            result[--size] = current.value;
            current = current.next;
        }
        return result;
    }


}
//leetcode submit region end(Prohibit modification and deletion)


}
