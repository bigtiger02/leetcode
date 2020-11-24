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
    public int maxPathSum(TreeNode root) {
        return 0;
    }
}
