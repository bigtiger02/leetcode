package cn.xhh.leetcode._206;

/**
 * Reverse linked list
 * <a href="https://leetcode-cn.com/problems/reverse-linked-list/">Reverse linked list</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class Solution1 {
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        if(null == head || head.next == null){
            return head;
        }

        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
