package cn.xhh.leetcode._002;

/**
 * Add Two Numbers
 * @see <a href="https://leetcode-cn.com/problems/add-two-numbers/">Add Two Numbers</a>
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2;

        ListNode dumNode = new ListNode(0);
        ListNode current = dumNode;
        int lastSum = 0;
        while(null != t1 || null != t2){
            int sum = lastSum;
            if(null != t1){
                sum = sum + t1.val;
                t1 = t1.next;
            }

            if(null != t2){
                sum = sum + t2.val;
                t2 = t2.next;
            }

            lastSum = sum / 10;
            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = node;
        }

        if(0 != lastSum){
            current.next = new ListNode(lastSum);
        }

        return dumNode.next;
    }
}
