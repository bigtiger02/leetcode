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

        return null;
    }
}
