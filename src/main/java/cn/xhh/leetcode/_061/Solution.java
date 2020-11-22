package cn.xhh.leetcode._061;

/**
 * Rotate list
 * <a href="https://leetcode-cn.com/problems/rotate-list/">Rotate list</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/22
 */
public class Solution {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(null == head || head.next == null){
            return head;
        }

        ListNode pHead = head;
        int len = 0;
        while(pHead != null){
            len++;
            pHead = pHead.next;
        }

        int step = k % len;
        if(0 == step){
            return head;
        }

        ListNode tHead = head, p = head, q = p;
        int tStep = 0;
        while(q != null){
            if(tStep < step){
                tStep++;
            }else{
                if(q.next != null){
                    p = p.next;
                }
            }
            if(q.next != null){
                q = q.next;
            }else{
                q.next = tHead;
                tHead = p.next;
                p.next = null;
                break;
            }
        }

        return tHead;
    }
}
