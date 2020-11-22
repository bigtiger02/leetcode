package cn.xhh.leetcode._061;

import org.junit.Assert;
import org.junit.Test;

/**
 * RotateListTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/22
 */
public class RotateListTest {
    private Solution solution = new Solution();

    private Solution.ListNode createNode(int[] arr){
        Solution.ListNode head = new Solution.ListNode();
        Solution.ListNode p = head;
        for (int i = 0; i < arr.length; i++) {
            Solution.ListNode node = new Solution.ListNode(arr[i]);
            p.next = node;
            p = p.next;
        }

        return head.next;
    }

    private void assertEquals(int[] expects, Solution.ListNode node){
        int i =0;
        boolean flag = true;
        Solution.ListNode p = node;
        while(flag && i < expects.length){
            flag = p.val == expects[i++];
            p = p.next;
        }

        if(expects.length != i || p != null){
            flag = false;
        }

        Assert.assertEquals(true ,flag);
    }

    @Test
    public void case1(){
        Solution.ListNode listNode = solution.rotateRight(createNode(new int[]{1,2,3,4,5}), 2);
        assertEquals(new int[]{4,5,1,2,3}, listNode);
    }

    @Test
    public void case2(){
        Solution.ListNode listNode = solution.rotateRight(createNode(new int[]{0,1,2}), 4);
        assertEquals(new int[]{2,0,1}, listNode);
    }

    @Test
    public void case3(){
        Solution.ListNode listNode = solution.rotateRight(createNode(new int[]{}), 1);
        assertEquals(new int[]{}, listNode);
    }

    @Test
    public void case4(){
        Solution.ListNode listNode = solution.rotateRight(createNode(new int[]{1}), 1);
        assertEquals(new int[]{1}, listNode);
    }

    @Test
    public void case5(){
        Solution.ListNode listNode = solution.rotateRight(createNode(new int[]{1,2}), 1);
        assertEquals(new int[]{2,1}, listNode);
    }

    @Test
    public void case6(){
        Solution.ListNode listNode = solution.rotateRight(createNode(new int[]{1,2}), 2);
        assertEquals(new int[]{1,2}, listNode);
    }
}
