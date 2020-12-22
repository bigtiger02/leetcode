package cn.xhh.leetcode._103;

import org.junit.Test;
/**
 * BinaryTreeZigzagLevelOrderTraversalTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/21
 */
public class BinaryTreeZigzagLevelOrderTraversalTest {
    private final Solution solution = new Solution();

    @Test
    public void case1() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2, new Solution.TreeNode(4),null),
                new Solution.TreeNode(3,null,new Solution.TreeNode(5)));
        solution.zigzagLevelOrder(root);
    }
}
