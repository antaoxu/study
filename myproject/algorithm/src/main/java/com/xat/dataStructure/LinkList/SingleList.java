package com.xat.dataStructure.LinkList;

/**
 * @author xuantao
 */
public class SingleList {
    class Node<T> {
        private T value;
        private Node next;

        public Node(T data){
            this.value = data;
        }

        public  Node reverseSingleList(Node head){
            Node pre = null;
            Node next = null;
            while (head != null){
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }

        /**
         * @param len
         * @param value
         * @return
         */
        public Node generateRandomSingleList(int len, int value){
            int size = (int) (Math.random()*(len + 1));
            if (size == 0){
                return null;
            }
            size--;
            Node head = new Node(Math.random()*(value + 1));
            Node pre = head;
            while (size != 0){
                Node current = new Node(Math.random()*(value + 1));
                pre.next = current;
                pre = current;
                size--;
            }
            return head;
        }


    }
}
