package cn.xhh.leetcode._084;

import java.util.Stack;

/**
 * largest rectangle in histogram
 * <a href="https://leetcode-cn.com/problems/largest-rectangle-in-histogram/">largest rectangle in histogram</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/16
 */
public class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] arr = new int[heights.length+2];
        for (int i = 0; i < heights.length; i++) {
            arr[i+1] = heights[i];
        }

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]){
                int height = arr[stack.pop()];
                maxArea = Math.max(maxArea, (i-stack.peek()-1)*height);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
