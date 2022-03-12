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

        public Node reverseNode(Node head){
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

        public Node detectCycle(Node head){
            Node fast = head;
            Node slow = head;
            while (true){
                if (fast == null || fast.next == null) return null;
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) break;
            }
            fast = head;
            while (slow != fast){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
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
