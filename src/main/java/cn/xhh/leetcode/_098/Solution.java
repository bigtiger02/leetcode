package cn.xhh.leetcode._098;

/**
 * validate binary search tree
 * <a href="https://leetcode-cn.com/problems/validate-binary-search-tree/">validate binary search tree</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/18
 */
public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if(null == root){
            return true;
        }

        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer min, Integer max){
        if(null == root){
            return true;
        }

        if(null != min && root.val <= min){
            return false;
        }

        if(null != max && root.val >= max){
            return false;
        }


        return isValidBST(root.left, min, root.val)
                && isValidBST(root.right, root.val, max);
    }
}
