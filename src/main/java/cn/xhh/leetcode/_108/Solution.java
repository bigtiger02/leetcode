package cn.xhh.leetcode._108;

/**
 * Convert sorted array to binary search tree
 * <a href="https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/">Convert sorted array to binary search tree</a>
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

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }

        return convert(nums,0, nums.length-1);
    }

    private TreeNode convert(int[] nums, int left, int right){
        if(left > right){
            return null;
        }

        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums,left,mid-1);
        root.right = convert(nums,mid+1,right);
        return root;
    }
}
