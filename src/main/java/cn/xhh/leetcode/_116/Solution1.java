package cn.xhh.leetcode._116;

import java.util.LinkedList;

/**
 * populating-next-right-pointers-in-each-node/
 * <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/">populating-next-right-pointers-in-each-node/</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/24
 */
public class Solution1 {

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
        if(null == root){
            return null;
        }

        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                node.next = i < len-1 ? queue.peek() : null;
                if(null != node.left){
                    queue.offer(node.left);
                }
                if(null != node.left){
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
