package cn.xhh.leetcode._160;

/**
 * Intersection of two linked lists
 * <a href="https://leetcode-cn.com/problems/intersection-of-two-linked-lists/">Intersection of two linked lists</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/27
 */
public class Solution {
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(null == headA || null == headB){
            return null;
        }

        ListNode pNodeA = headA;
        ListNode pNodeB = headB;
        while(pNodeA != pNodeB){
            pNodeA = pNodeA != null ? pNodeA.next : headB;
            pNodeB = pNodeB != null ? pNodeB.next : headA;
        }

        return pNodeA;
    }
}
