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

    private Map<Integer, TreeNode> parentMap = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(null == root){
            return null;
        }

        dfs(root);

        while(p != null){
            visited.add(p.val);
            p = parentMap.get(p.val);
        }

        while(q != null){
            if(visited.contains(q.val)){
                return q;
            }
            q = parentMap.get(q.val);
        }
        return null;
    }

    private void dfs(TreeNode root) {
        if(root.left != null){
            parentMap.put(root.left.val, root);
            dfs(root.left);
        }

        if(root.right != null){
            parentMap.put(root.right.val, root);
            dfs(root.right);
        }
    }
}
