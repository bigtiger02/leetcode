package cn.xhh.leetcode._021;

/**
 * Merge two sorted list
 * <a href="https://leetcode-cn.com/problems/merge-two-sorted-lists/">Merge two sorted list</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/17
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null == l1){
            return l2;
        }

        if(null == l2){
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode tNode = head;

        ListNode t1 = l1 ,t2 = l2;
        while(t1 != null || t2 != null){
            if(null == t1){
                tNode.next = t2;
                t2 = t2.next;
            }else if(null == t2){
                tNode.next = t1;
                t1 = t1.next;
            } else if(t1.val <= t2.val){
                tNode.next = t1;
                t1 = t1.next;
            }else{
                tNode.next = t2;
                t2 = t2.next;
            }
            tNode = tNode.next;
        }


        return head.next;
    }
}
