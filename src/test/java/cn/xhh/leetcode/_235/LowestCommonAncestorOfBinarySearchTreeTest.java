package cn.xhh.leetcode._235;

import org.junit.Assert;
import org.junit.Test;

/**
 * LowestCommonAncestorOfBinarySearchTreeTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/30
 */
public class LowestCommonAncestorOfBinarySearchTreeTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        Solution.TreeNode root = new Solution.TreeNode(6,
                new Solution.TreeNode(2,
                        new Solution.TreeNode(0),
                        new Solution.TreeNode(4,
                                new Solution.TreeNode(3),
                                new Solution.TreeNode(5))),
                new Solution.TreeNode(8,
                        new Solution.TreeNode(7),
                        new Solution.TreeNode(9)));
        Solution.TreeNode result = solution.lowestCommonAncestor(root,
                new Solution.TreeNode(2),
                new Solution.TreeNode(4));
        Assert.assertEquals(2, result.val);
    }
}
