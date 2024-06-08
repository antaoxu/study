package com.xat.dataStructure.tree;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 淡漠
 */
public class TreeTest {
    public static void main(String[] args) {
        TreeTest test = new TreeTest();
        TreeNode tree = test.createTree();
        for (Integer integer : test.levelOrder(tree)) {
            System.out.println("遍历后的列表为："+integer + "," );
        }


    }


    public List<Integer> levelOrder(TreeNode root){
        List<Integer> result = new LinkedList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            result.add(node.val);
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
        }
        return result;
    }
    /**
     * 新建tree
     * @return
     */
    public  TreeNode createTree(){
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(6);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;
        return root;
    }

     class TreeNode {
        int val;         // 节点值
        TreeNode left;   // 左子节点引用
        TreeNode right;  // 右子节点引用
        TreeNode(int x) { val = x; }
    }
}
