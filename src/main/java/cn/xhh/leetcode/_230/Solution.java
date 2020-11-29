package cn.xhh.leetcode._230;

/**
 * kth smallest element in a best
 * <a href="https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/">kth smallest element in a best</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class Solution {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        TreeNode(int val){this.val = val;}

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int count;
    private int val;
    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        val = Integer.MIN_VALUE;
        dfs(root, k);
        return val;
    }

    public void dfs(TreeNode root, int k){
        if(null == root){
            return;
        }

        dfs(root.left,k);
        count++;
        if(count == k){
            val = root.val;
            return;
        }
        dfs(root.right,k);
    }
}
