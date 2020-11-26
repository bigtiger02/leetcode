package cn.xhh.leetcode._148;

/**
 * Sort list
 * <a href="https://leetcode-cn.com/problems/sort-list/">Sort list</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/26
 */
public class Solution {
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        int len = len(head);
        ListNode dummyHead = new ListNode(0, head);
        for (int subLen = 1; subLen < len; subLen <<= 1) {
            ListNode prev = dummyHead, curr = dummyHead.next;
            while (curr != null) {
                ListNode head1 = curr;
                for (int i = 1; i < subLen && curr.next != null; i++) {
                    curr = curr.next;
                }
                ListNode head2 = curr.next;
                curr.next = null;
                curr = head2;
                for (int i = 1; i < subLen && curr != null && curr.next != null; i++) {
                    curr = curr.next;
                }
                ListNode next = null;
                if (curr != null) {
                    next = curr.next;
                    curr.next = null;
                }
                ListNode merged = mergeSortedList(head1, head2);
                prev.next = merged;
                while (prev.next != null) {
                    prev = prev.next;
                }
                curr = next;
            }
        }
        return dummyHead.next;
    }

    private ListNode mergeSortedList(ListNode node1, ListNode node2){
        ListNode head = new ListNode(0);
        ListNode pNode = head,tNode1 = node1, tNode2 = node2;
        while(tNode1 != null && tNode2 != null){
            if(tNode1.val <= tNode2.val){
                pNode = tNode1;
                tNode1 = tNode1.next;
            }else{
                pNode = tNode2;
                tNode2 = tNode2.next;
            }
            pNode = pNode.next;
        }

        if(tNode1 != null){
            pNode.next = tNode1;
        }else if(tNode2 != null){
            pNode.next = tNode2;
        }

        return head.next;
    }

    private int len(ListNode head){
        ListNode pNode = head;
        int len = 0;
        while(pNode != null){
            len++;
            pNode = pNode.next;
        }

        return len;
    }
}
