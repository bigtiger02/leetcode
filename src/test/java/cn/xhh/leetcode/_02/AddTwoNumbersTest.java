package cn.xhh.leetcode._02;

import org.junit.Test;
import  org.junit.Assert;

/**
 * AddTwoNumbersTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class AddTwoNumbersTest {
    private Solution solution = new Solution();

    /**
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */
    @Test
    public void case1(){
        ListNode n1 = createNode(2, 4, 3);
        ListNode n2 = createNode(5, 6, 4);
        ListNode result = solution.addTwoNumbers(n1, n2);
        ListNode expect = createNode(7, 0, 8);
        assertNodeEquals(expect, result);
    }

    /**
     * 输入：(2 -> 9) + (5 -> 6 -> 4)
     * 输出：7 -> 5 -> 5
     * 原因：92 + 465 = 557
     */
    @Test
    public void case2(){
        ListNode n1 = createNode(2, 9);
        ListNode n2 = createNode(5, 6, 4);
        ListNode result = solution.addTwoNumbers(n1, n2);
        ListNode expect = createNode(7, 5, 5);
        assertNodeEquals(expect, result);
    }

    private ListNode createNode(int... values){
        if(values.length < 1){
            return new ListNode(0);
        }

        ListNode firstNode = new ListNode(values[0]);
        ListNode currentNode = firstNode;
        for(int i = 1; i < values.length; i++){
            ListNode next = new ListNode(values[i]);
            currentNode.next = next;
            currentNode = next;
        }

        return firstNode;
    }

    private void assertNodeEquals(ListNode node1, ListNode node2){
        ListNode t1 = node1, t2 = node2;
        boolean flag = true;
        while(flag && (null != t1 || null != t2)){
            if(null == t1){
                flag = false;
            }else if(null == t2){
                flag = false;
            }else{
                flag = t1.val == t2.val;
            }

            t1 = t1.next;
            t2 = t2.next;
        }

        Assert.assertEquals(Boolean.TRUE, flag);
    }
}
