package com.xat.dataStructure.LinkList;

/**
 * @author xuantao
 */
public class DoubleList {
    class DoubleNode<T>{
        private DoubleNode last;
        private DoubleNode next;
        private T value;

        DoubleNode(T value) {
            this.value = value;
        }
    }

    /**
     * 双向链表反转
     */
    public DoubleNode reverseDoubleNode(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    public DoubleNode generateRandomDoubleList(int len, int value){
        int size = (int) (Math.random()*(len + 1));
        if (size == 0){
            return null;
        }
        size--;
        DoubleNode head = new DoubleNode(Math.random()*(value + 1));
        DoubleNode pre = head;
        return head;

    }



}
