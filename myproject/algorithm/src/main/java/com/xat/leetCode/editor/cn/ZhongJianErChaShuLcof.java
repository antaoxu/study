package com.xat.leetCode.editor.cn;

//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
//
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
//
//
//
// 示例 1:
//
//
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
//
//
// 示例 2:
//
//
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
//
//
//
//
// 限制：
//
// 0 <= 节点个数 <= 5000
//
//
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/
// Related Topics 树 数组 哈希表 分治 二叉树 👍 725 👎 0

import java.util.HashMap;
import java.util.Map;

public class ZhongJianErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();

    }

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //如果前序遍历数组和中序遍历数组为空，或者两个数组长度不一致，无法重建，直接返回null
        if (preorder == null || inorder == null || preorder.length != inorder.length){
            return null;
        }
        //优化：将中序遍历结果保存在map，不用每次递归去查找根节点
        Map<Integer,Integer> rootValueIndex = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            rootValueIndex.put(inorder[i],i);
        }
        return f(preorder,0,preorder.length -1,inorder,0,inorder.length - 1,rootValueIndex);


    }
    public  TreeNode f(int[] pre,int L,int R,int[] in,int L2, int R2,Map<Integer,Integer> rootValueIndex){
        if (L > R){
            return null;
        }
        //通过前序遍历数组抓到根节点
        TreeNode head = new TreeNode(pre[L]);
        if (L == R){
            return head;
        }
        //找到中序遍历数组中根节点所在位置
        int find = rootValueIndex.get(pre[L]);
        /*while (pre[L] != in[find]){
            find++;
        }*/
        //递归左右子树拿到左右子树的根节点
        head.left = f(pre,L+1,L+(find-L2),in,L2,find - 1,rootValueIndex);
        head.right = f(pre,L+1+find-L2,R,in,find+1,R2,rootValueIndex);
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
