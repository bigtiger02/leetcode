package cn.xhh.leetcode._148;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * SortListTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/26
 */
public class SortListTest {
    private Solution solution = new Solution();

    private Solution.ListNode createListNode(int[] arr){
        Solution.ListNode head = new Solution.ListNode(arr[0]);
        Solution.ListNode pNode = head;
        for (int i = 0; i < arr.length; i++) {
            pNode.next = new Solution.ListNode(arr[i]);
            pNode = pNode.next;
        }
        return head;
    }

    private Integer[] convertTo(Solution.ListNode head){
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        return list.toArray(new Integer[0]);
    }

    @Test
    public void case1(){
        Solution.ListNode node = solution.sortList(createListNode(new int[]{4,2,1,3}));
        Integer[] results = convertTo(node);
        Assert.assertArrayEquals(new Integer[]{1,2,3,4},results);
    }

    @Test
    public void case2(){
        Solution.ListNode node = solution.sortList(createListNode(new int[]{-1,5,3,4,0}));
        Integer[] results = convertTo(node);
        Assert.assertArrayEquals(new Integer[]{-1,0,3,4,5},results);
    }

    @Test
    public void case3(){
        Solution.ListNode node = solution.sortList(null);
        Assert.assertNull(node);
    }
}
