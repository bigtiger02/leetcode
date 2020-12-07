package cn.xhh.leetcode._102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * binary tree level order traversal
 * <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal/">binary tree level order traversal</a>
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

    private static class QueueNode{
        int level;
        TreeNode treeNode;

        public QueueNode(int level, TreeNode treeNode) {
            this.level = level;
            this.treeNode = treeNode;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if(root == null){
            return results;
        }
        LinkedList<QueueNode> queue = new LinkedList<>();
        queue.add(new QueueNode(1, root));
        while(!queue.isEmpty()){
            QueueNode queueNode = queue.pop();
            int level = queueNode.level;
            TreeNode treeNode = queueNode.treeNode;
            if(results.size() < level){
                results.add(new ArrayList<>());
            }

            results.get(level-1).add(treeNode.val);
            if(treeNode.left != null){
                queue.add(new QueueNode(level+1, treeNode.left));
            }

            if(treeNode.right != null){
                queue.add(new QueueNode(level+1, treeNode.right));
            }
        }

        return results;
    }
}
