package cn.xhh.leetcode._103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * binary-tree-zigzag-level-order-traversal
 * <a href="https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/">binary-tree-zigzag-level-order-traversal/</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/21
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if(null == root){
            return results;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftDirection = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> tmp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(leftDirection){
                    tmp.offerFirst(node.val);
                }else{
                    tmp.offerLast(node.val);
                }

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }

            results.add(tmp);
            leftDirection = !leftDirection;
        }

        return results;
    }
}
