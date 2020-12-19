package cn.xhh.leetcode._098;

import org.junit.Assert;
import org.junit.Test;

/**
 * ValidateBinarySearchTreeTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/19
 */
public class ValidateBinarySearchTreeTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        Solution.TreeNode root = new Solution.TreeNode(1,new Solution.TreeNode(1),null);
        boolean result = solution.isValidBST(root);
        Assert.assertEquals(false, result);
    }
}
