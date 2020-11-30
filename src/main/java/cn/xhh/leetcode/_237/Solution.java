package cn.xhh.leetcode._237;

/**
 * SOlution
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/1
 */
public class Solution {
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
