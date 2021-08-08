package com.xat.class02;

import java.util.LinkedList;

/**
 * @author 淡漠
 */
public class InverseList {
    static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * 链表反转
     * @param head
     * @return
     */
    public static Node inverseLinkedList(Node head){
        Node pre = null;
        Node next;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head =next;
        }
        return pre;
    }

    public static void main(String[] args) {
        LinkedList<Node> list = new LinkedList();
        list.add(new Node(19));
        list.add(new Node(26));
        list.add(new Node(2));
        System.out.println(inverseLinkedList(list.getFirst()).value);

    }
}
