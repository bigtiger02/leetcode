package cn.xhh.leetcode._019;

/**
 * remove-nth-node-from-end-of-list
 * <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">remove-nth-node-from-end-of-list</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/3
 */
public class Solution {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(null == head || head.next == null){
            return null;
        }


        ListNode dummyHead = head;
        ListNode first = head, last = head.next;
        int len = 1, count = 1;
        while(last != null){
            if(count < n+1){
                count++;
            }else{
                first = first.next;
            }
            len++;
            last = last.next;
        }

        if(n == len){
            return dummyHead.next;
        }

        first.next = first.next.next;
        return dummyHead;
    }
}
