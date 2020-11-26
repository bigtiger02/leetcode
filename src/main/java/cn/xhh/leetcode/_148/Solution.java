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

        //获取链表长度
        int len = length(head);
        ListNode dummyHead = new ListNode(0, head);
        //开始归并
        for (int step = 1; step < len; step = step << 1) {
            ListNode prev = dummyHead, current = dummyHead.next;
            while(current != null){
                //获取第一个链表
                ListNode[] results1 = cut(current, step);
                current = results1[1];
                //获取第二个链表
                ListNode[] results2 = cut(current, step);
                current = results2[1];
                //归并
                ListNode merged = merge(results1[0], results2[0]);
                //之前分成了两段，需要重新连接成一个链表
                prev = concat(prev, merged);
            }
        }

        return dummyHead.next;
    }

    private ListNode concat(ListNode prev, ListNode merged) {
        prev.next = merged;
        while(prev.next != null){
            prev = prev.next;
        }
        return prev;
    }

    private ListNode merge(ListNode node1, ListNode node2) {
        if(null == node1){
            return node2;
        }

        if(null == node2){
            return node1;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode pNode = dummyHead, pNode1 = node1, pNode2 = node2;
        while(pNode1 != null && pNode2 != null){
            if(pNode1.val > pNode2.val){
                pNode.next = pNode2;
                pNode2 = pNode2.next;
            }else{
                pNode.next = pNode1;
                pNode1 = pNode1.next;
            }
            pNode = pNode.next;
        }

        if(pNode1 != null){
            pNode.next = pNode1;
        }else if(pNode2 != null){
            pNode.next = pNode2;
        }

        return dummyHead.next;
    }

    private ListNode[] cut(ListNode current, int len) {
        if(current == null){
            return new ListNode[]{null, null};
        }

        ListNode dummyNode = new ListNode(0, current);
        int step = 1;
        while(step < len && current != null){
            current = current.next;
            step++;
        }

        //将尾节点设置为null，并将头指针后移
        if(current != null){
            ListNode next = current.next;
            current.next = null;
            current = next;
        }

        return new ListNode[]{dummyNode.next, current};
    }

    private int length(ListNode head) {
        int len = 0;
        if(null == head){
            return len;
        }

        ListNode pNode = head;
        while(pNode != null){
            pNode = pNode.next;
            len++;
        }
        return len;
    }
}
