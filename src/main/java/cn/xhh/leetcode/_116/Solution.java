package cn.xhh.leetcode._116;

import java.util.LinkedList;
import java.util.Queue;

/**
 * populating-next-right-pointers-in-each-node/
 * <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/">populating-next-right-pointers-in-each-node/</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/24
 */
public class Solution {

    public static class Node{
        int val;
        Node left;
        Node right;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node connect(Node root) {
        if(null == root || root.left == null){
            return root;
        }

        root.left.next = root.right;
        root.right.next = root.next != null ? root.next.left : null;

        connect(root.left);
        connect(root.right);
        return root;
    }
}
