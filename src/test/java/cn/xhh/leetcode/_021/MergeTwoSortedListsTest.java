package cn.xhh.leetcode._021;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * MergeTwoSortedListsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/17
 */
public class MergeTwoSortedListsTest {
    private Solution solution = new Solution();

    private void assertTrue(Integer[] expects, Solution.ListNode node){
        List<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = node.next;
        }

        Assert.assertArrayEquals(expects, list.toArray(new Integer[list.size()]));
    }

    private Solution.ListNode createNode(int[] nums){
        Solution.ListNode head = new Solution.ListNode(0);
        Solution.ListNode pNode = head;
        for (int i = 0; i < nums.length; i++) {
            Solution.ListNode tmp = new Solution.ListNode(nums[i]);
            pNode.next = tmp;
            pNode = pNode.next;
        }

        return head.next;
    }

    @Test
    public void case1(){
        Solution.ListNode result = solution.mergeTwoLists(
                createNode(new int[]{1,2,4}),
                createNode(new int[]{1,3,4})
        );
        assertTrue(new Integer[]{1,1,2,3,4,4}, result);
    }

    @Test
    public void case2(){
        Solution.ListNode result = solution.mergeTwoLists(
                createNode(new int[]{}),
                createNode(new int[]{})
        );
        assertTrue(new Integer[]{}, result);
    }

    @Test
    public void case3(){
        Solution.ListNode result = solution.mergeTwoLists(
                createNode(new int[]{}),
                createNode(new int[]{1,1,2,3})
        );
        assertTrue(new Integer[]{1,1,2,3}, result);
    }


    @Test
    public void case4(){
        Solution.ListNode result = solution.mergeTwoLists(
                createNode(new int[]{1,1,2,3}),
                createNode(new int[]{})
        );
        assertTrue(new Integer[]{1,1,2,3}, result);
    }
}
