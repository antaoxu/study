package com.xat.dataStructure.tree;

/**
 * @author xuantao
 */
public class TreeBase {

    /**
     * 递归前序遍历
     * @param head
     */
    public static void preOrderIteration(TreeNode head){
        if (head == null){
            return;
        }
        System.out.print(head.value + " ");
        preOrderIteration(head.left);
        preOrderIteration(head.right);
    }

    class TreeNode{

        private TreeNode left;
        private TreeNode right;
        private int value;

        public TreeNode(TreeNode left, TreeNode right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
