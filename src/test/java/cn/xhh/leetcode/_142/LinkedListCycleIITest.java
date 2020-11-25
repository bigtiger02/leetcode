package cn.xhh.leetcode._142;

import org.junit.Assert;
import org.junit.Test;

/**
 * LinkedListCycleIITest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/25
 */
public class LinkedListCycleIITest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        Solution.ListNode head = new Solution.ListNode(3);
        Solution.ListNode second = new Solution.ListNode(2);
        head.next =second;
        Solution.ListNode third = new Solution.ListNode(0);
        second.next = third;
        Solution.ListNode fourth = new Solution.ListNode(4);
        third.next = fourth;
        fourth.next = second;
        Solution.ListNode result = solution.detectCycle(head);
        Assert.assertEquals(second,result);
    }

    @Test
    public void case2(){
        Solution.ListNode head = new Solution.ListNode(1);
        Solution.ListNode second = new Solution.ListNode(2);
        head.next = second;
        second.next = head;
        Solution.ListNode result = solution.detectCycle(head);
        Assert.assertEquals(head,result);
    }

    @Test
    public void case3(){
        Solution.ListNode head = new Solution.ListNode(1);
        Solution.ListNode result = solution.detectCycle(head);
        Assert.assertNull(result);
    }
}
