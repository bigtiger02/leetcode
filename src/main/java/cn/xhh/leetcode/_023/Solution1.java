package cn.xhh.leetcode._023;

/**
 * Merge k sorted lists
 * <a href="https://leetcode-cn.com/problems/merge-k-sorted-lists/">merge k sorted lists</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/17
 */
public class Solution1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, Solution1.ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(null == lists){
            return null;
        }

        if(lists.length == 1){
            return lists[0];
        }

        ListNode head = new ListNode(0);
        ListNode pNode = head;
        ListNode tmp = null;
        int index = 0;
        do{
            tmp = null;
            for (int i = 0; i < lists.length; i++) {
                if(null == lists[i]){
                    continue;
                }

                if(null == tmp){
                    index = i;
                    tmp = lists[i];
                }else if(tmp.val > lists[i].val){
                    index = i;
                    tmp = lists[i];
                }
            }

            if(null == tmp){
                break;
            }

            pNode.next = tmp;
            pNode = pNode.next;
            lists[index] = null == lists[index] ? null : lists[index].next;
        }while(null != tmp);
        return head.next;
    }
}
