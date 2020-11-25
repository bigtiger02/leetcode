package cn.xhh.leetcode._142;

/**
 * Linked list cycle ii
 * <a href="https://leetcode-cn.com/problems/linked-list-cycle-ii/">Linked list cycle ii</a>
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

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slowNode = head, fastNode = head;

        while(fastNode != null){
            slowNode = slowNode.next;
            if(fastNode.next == null){
                return null;
            }else{
                fastNode = fastNode.next.next;
            }

            if(slowNode == fastNode){
                ListNode firstNode = head;
                while(firstNode != slowNode){
                    firstNode = firstNode.next;
                    slowNode = slowNode.next;
                }

                return firstNode;
            }
        }

        return null;
    }
}
