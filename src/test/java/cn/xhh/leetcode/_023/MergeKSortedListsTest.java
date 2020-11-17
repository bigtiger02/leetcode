package cn.xhh.leetcode._023;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * MergeKSortedListsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/17
 */
public class MergeKSortedListsTest {

    private Solution solution = new Solution();

    private void assertTrue(Integer[] expects, Solution.ListNode node){
        List<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = node.next;
        }

        Assert.assertArrayEquals(expects, list.toArray(new Integer[list.size()]));
    }

    private Solution.ListNode createNode(int[] numbers){
        Solution.ListNode head = new Solution.ListNode(0);
        Solution.ListNode pNode = head;
        for (int i = 0; i < numbers.length; i++) {
            Solution.ListNode tmp = new Solution.ListNode(numbers[i]);
            pNode.next = tmp;
            pNode = pNode.next;
        }

        return head.next;
    }

    @Test
    public void case1(){
        Solution.ListNode[] nodes = new Solution.ListNode[]{
                createNode(new int[]{1,4,5}),
                createNode(new int[]{1,3,4}),
                createNode(new int[]{2,6})
        };
        Solution.ListNode result = solution.mergeKLists(nodes);
        assertTrue(new Integer[]{1,1,2,3,4,4,5,6}, result);
    }

    @Test
    public void case2(){
        Solution.ListNode[] nodes = new Solution.ListNode[]{
                null,
                createNode(new int[]{2,6})
        };
        Solution.ListNode result = solution.mergeKLists(nodes);
        assertTrue(new Integer[]{2,6}, result);
    }

    @Test
    public void case3(){
        Solution.ListNode[] nodes = new Solution.ListNode[]{
                null,
                null,
                createNode(new int[]{2,6})
        };
        Solution.ListNode result = solution.mergeKLists(nodes);
        assertTrue(new Integer[]{2,6}, result);
    }
}
