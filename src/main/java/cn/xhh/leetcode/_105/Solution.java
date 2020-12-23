package cn.xhh.leetcode._105;

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
        for (int i = 0; i < inorder.length; i++) {
            inOrderIndexMap.put(inorder[i],i);
        }
        return build(preorder,0, preorder.length-1,
                0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder,
                           int preLeft, int preRight,
                           int inLeft, int inRight) {
        if(preLeft > preRight || inLeft > inRight){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preLeft]);
        int rootIndex = inOrderIndexMap.get(preorder[preLeft]);
        int len = rootIndex - inLeft;
        root.left = build(preorder, preLeft+1, preLeft+len, inLeft, rootIndex-1);
        root.right = build(preorder, preLeft+len+1,preRight,rootIndex+1,inRight);
        return root;
    }
}
