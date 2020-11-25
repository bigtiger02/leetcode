package cn.xhh.leetcode._124;

import org.junit.Assert;
import org.junit.Test;

/**
 * BinaryTreeMaximumPathSumTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/25
 */
public class BinaryTreeMaximumPathSumTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        Solution.TreeNode left = new Solution.TreeNode(2);
        Solution.TreeNode right = new Solution.TreeNode(3);
        Solution.TreeNode root = new Solution.TreeNode(1,left,right);
        int result = solution.maxPathSum(root);
        Assert.assertEquals(6, result);
    }

    @Test
    public void case2(){
        Solution.TreeNode root = new Solution.TreeNode(-10,
                new Solution.TreeNode(9),new Solution.TreeNode(20,
                new Solution.TreeNode(15), new Solution.TreeNode(7)));
        int result = solution.maxPathSum(root);
        Assert.assertEquals(42, result);
    }

    @Test
    public void case3(){
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(-2),new Solution.TreeNode(3));
        int result = solution.maxPathSum(root);
        Assert.assertEquals(4, result);
    }
}
