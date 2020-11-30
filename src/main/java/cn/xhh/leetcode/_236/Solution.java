package cn.xhh.leetcode._236;

import java.util.*;

/**
 * lowest-common-ancestor-of-a-binary-tree
 * <a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/">lowest-common-ancestor-of-a-binary-tree</a>
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

    private boolean flag;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(null == root){
            return null;
        }

        List<TreeNode> path1 = new ArrayList<>();
        this.flag = false;
        dfs(root, p, path1);

        List<TreeNode> path2 = new ArrayList<>();
        this.flag = false;
        dfs(root, q, path2);

        int len = Math.min(path1.size(), path2.size());
        TreeNode result = null;
        for (int i = 0; i < len; i++) {
            if(path1.get(i).val == path2.get(i).val){
                result = path1.get(i);
            }else{
                break;
            }
        }

        return result;
    }

    private void dfs(TreeNode root, TreeNode p, List<TreeNode> path) {
        if(null == root){
            return;
        }

        path.add(root);
        if(root.val == p.val){
            this.flag = true;
            return;
        }

        if(!flag){
            dfs(root.left, p, path);
        }

        if(!flag){
            dfs(root.right, p, path);
        }

        if(!flag){
            path.remove(root);
        }
    }
}
