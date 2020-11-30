package cn.xhh.leetcode._235;

import cn.xhh.leetcode._206.Solution1;

import java.util.ArrayList;
import java.util.List;

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
        List<TreeNode> path1 = findNode(root, p);
        List<TreeNode> path2 = findNode(root, q);

        int len = Math.min(path1.size(), path2.size());
        TreeNode result = null;
        for (int i = 0; i < len; i++) {
            if(path1.get(i).equals(path2.get(i))){
                result = path1.get(i);
            }else{
                break;
            }
        }
        return result;
    }

    private List<TreeNode> findNode(TreeNode root, TreeNode node) {
        TreeNode pNode = root;
        List<TreeNode> path = new ArrayList<>();
        while(pNode != null){
            path.add((pNode));
            if(pNode.val > node.val){
                pNode = pNode.left;
            }else if(pNode.val < node.val){
                pNode = pNode.right;
            }else{
                break;
            }
        }

        return path;
    }
}
