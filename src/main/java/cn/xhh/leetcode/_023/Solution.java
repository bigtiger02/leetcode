package cn.xhh.leetcode._023;

import java.util.PriorityQueue;

/**
 * Merge k sorted lists
 * <a href="https://leetcode-cn.com/problems/merge-k-sorted-lists/">merge k sorted lists</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/17
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, Solution.ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(null == lists){
            return null;
        }

        if(lists.length == 1){
            return lists[0];
        }
    

        PriorityQueue<ListNode> queue = new PriorityQueue<>((n1,n2)->Integer.compare(n1.val,n2.val));

        for (int i = 0; i < lists.length; i++) {
            while(lists[i] != null){
                ListNode node = lists[i];
                lists[i] = lists[i].next;
                node.next = null;
                queue.add(node);
            }
        }

        ListNode head = new ListNode(0);
        ListNode pNode = head;
        while (!queue.isEmpty()) {
            pNode.next = queue.poll();
            pNode = pNode.next;
        }
        
        return head.next;
    }
}
