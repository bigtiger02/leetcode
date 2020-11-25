package cn.xhh.leetcode._124;

/**
 * Binary tree maximum path sum
 * <a href="https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/">Binary tree maximum path sum</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/25
 */
public class Solution {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int maxSum = 0;
    public int maxPathSum(TreeNode root) {
        if(null == root){
            return 0;
        }
        maxSum = root.val;
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if(null == node){
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        // 更新答案
        maxSum = Math.max(maxSum, node.val + left + right);

        // 返回节点的最大贡献值
        int tMax = node.val + Math.max(left, right);
        return Math.max(tMax,0);
    }
}
