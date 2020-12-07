package cn.xhh.leetcode._094;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Binary tree inorder traversal
 * <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">Binary tree inorder traversal</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/7
 */
public class Solution {

    public static class TreeNode{
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

    private static class ColorNode{
        boolean visited;
        TreeNode treeNode;

        public ColorNode(boolean color, TreeNode treeNode) {
            this.visited = color;
            this.treeNode = treeNode;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new LinkedList<>();
        if(null == root){
            return results;
        }
        Stack<ColorNode> stack = new Stack<>();
        stack.add(new ColorNode(false, root));
        while(!stack.isEmpty()){
            ColorNode node = stack.pop();
            TreeNode treeNode = node.treeNode;
            if(node.visited){
                results.add(treeNode.val);
            }else{
                if(treeNode.right != null){
                    stack.add(new ColorNode(false, treeNode.right));
                }
                stack.add(new ColorNode(true, treeNode));
                if(treeNode.left != null){
                    stack.add(new ColorNode(false,treeNode.left));
                }
            }
        }

        return results;
    }

}
