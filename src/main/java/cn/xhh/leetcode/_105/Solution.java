package cn.xhh.leetcode._105;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * construct-binary-tree-from-preorder-and-inorder-traversal
 * <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">construct-binary-tree-from-preorder-and-inorder-traversal</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/22
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

    private Map<Integer,Integer> inOrderIndexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(null == preorder || preorder.length == 0
                || null == inorder || inorder.length == 0){
            return null;
        }

        for (int i = 0; i < inorder.length; i++) {
            inOrderIndexMap.put(inorder[i],i);
        }


        return buildTree(preorder,inorder,
                0,preorder.length-1,
                0, inorder.length-1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder,
                               int preOrderStart, int preOrderEnd,
                               int inOrderStart, int inOrderEnd){
        if(preOrderStart >= preOrderEnd){
            return null;
        }

        if(inOrderStart >= inOrderEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preOrderStart]);
        int index = inOrderIndexMap.get(preorder[preOrderStart]);
        preOrderStart = preOrderStart+1;
        preOrderEnd = Math.max(preOrderStart+1+index, preorder.length);
        root.left = buildTree(preorder, inorder,
                preOrderStart+1, preOrderEnd,
                0, inOrderStart);

        inOrderStart = inOrderStart;
        inOrderEnd = inOrderStart;
        root.right = buildTree(preorder, inorder,
                preOrderStart+1, preOrderStart+1+index,
                index, inorder.length);
        return root;
    }
}
