package cn.xhh.leetcode._101;

import java.util.LinkedList;
/**
 * symmetric tree
 * <a href="https://leetcode-cn.com/problems/symmetric-tree/">symmetric tree</a>
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
    }

    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if(left == null && right == null){
                continue;
            }
            if(left == null || right == null || left.val != right.val){
                return false;
            }

            queue.offer(left.left);
            queue.offer(right.right);

            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }


}
