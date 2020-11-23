package cn.xhh.leetcode._104;

/**
 * Maximum depth of binary tree
 * <a href="https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/">Maximum depth of binary tree</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/23
 */
public class Solution {

     public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }

    public int maxDepth(TreeNode root) {
         return dfs(root, 0);
    }

    private int dfs(TreeNode node, int depth){
         if(null == node){
             return depth;
         }
         int left = dfs(node.left,depth+1);
         int right = dfs(node.right, depth+1);
         return Math.max(left, right);
    }
}
