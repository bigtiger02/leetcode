package cn.xhh.leetcode._104;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * MaximumDepthOfBinaryTreeTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/23
 */
public class MaximumDepthOfBinaryTreeTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        Solution.TreeNode root = new Solution.TreeNode(3);
        root.left = new Solution.TreeNode(9);
        Solution.TreeNode right = new Solution.TreeNode(20);
        right.left = new Solution.TreeNode(15);
        right.right = new Solution.TreeNode(7);
        root.right = right;
        int result = solution.maxDepth(root);
        Assert.assertEquals(3,result);
    }
}
