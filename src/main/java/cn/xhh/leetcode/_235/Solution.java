package cn.xhh.leetcode._235;

/**
 * lowest-common-ancestor-of-a-binary-search-tree
 * <a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">lowest-common-ancestor-of-a-binary-search-tree</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/30
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    }
}
