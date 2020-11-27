package cn.xhh.leetcode._160;

import org.junit.Assert;
import org.junit.Test;

/**
 * IntersectionOfTwoLinkedListsTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/27
 */
public class IntersectionOfTwoLinkedListsTest {
    private Solution solution = new Solution();

    private Solution.ListNode createNodes(int[] arr){
        Solution.ListNode head = new Solution.ListNode(0);
        Solution.ListNode pNode = head;
        for (int i = 0; i < arr.length; i++) {
            pNode.next = new Solution.ListNode(arr[i]);
            pNode = pNode.next;
        }

        return head.next;
    }

    @Test
    public void case1(){
        Solution.ListNode headA = createNodes(new int[]{4,1,8,4,5});
        Solution.ListNode headB = createNodes(new int[]{5,0,1,8,4,5});
        Solution.ListNode node = solution.getIntersectionNode(headA, headB);
        Assert.assertEquals(8, node.val);
    }

    @Test
    public void case2(){
        Solution.ListNode headA = createNodes(new int[]{0,9,1,2,4});
        Solution.ListNode headB = createNodes(new int[]{3,2,4});
        Solution.ListNode node = solution.getIntersectionNode(headA, headB);
        Assert.assertEquals(2, node.val);
    }

    @Test
    public void case3(){
        Solution.ListNode headA = createNodes(new int[]{0,9});
        Solution.ListNode headB = createNodes(new int[]{3,2,4});
        Solution.ListNode node = solution.getIntersectionNode(headA, headB);
        Assert.assertNull(node);
    }
}
