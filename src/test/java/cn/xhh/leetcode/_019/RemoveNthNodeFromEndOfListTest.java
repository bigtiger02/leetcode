package cn.xhh.leetcode._019;

import org.junit.Test;

/**
 * RemoveNthNodeFromEndOfListTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class RemoveNthNodeFromEndOfListTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        Solution.ListNode head = new Solution.ListNode(1,new Solution.ListNode(2,
                new Solution.ListNode(3, new Solution.ListNode(4,new Solution.ListNode(5)))));
        solution.removeNthFromEnd(head,2);
    }
}
