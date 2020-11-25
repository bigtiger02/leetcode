package cn.xhh.leetcode._141;

import java.util.HashSet;
import java.util.Set;

/**
 * Linked list cycle
 * <a href="https://leetcode-cn.com/problems/linked-list-cycle/">Linked list cycle</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/25
 */
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slowNode = head, fastNode = head.next;
        while(slowNode != fastNode){
            if(fastNode == null || fastNode.next == null){
                return false;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        return true;
    }
}
