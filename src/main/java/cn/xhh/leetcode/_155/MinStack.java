package cn.xhh.leetcode._155;

import java.util.Stack;

/**
 * MinStack
 * <a href="https://leetcode-cn.com/problems/min-stack/">Min Stack</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/27
 */
public class MinStack {
    private Stack<Long> stack = new Stack<Long>();
    private long min = 0;
    public MinStack() {
    }

    public void push(int x) {
        if(stack.isEmpty()){
            min = x;
            stack.push(0L);
        }else{
            long diff = x-min;
            stack.push(diff);
            min = diff < 0 ? x : min;
        }
    }

    public void pop() {
        long diff = stack.pop();
        if(diff < 0){
            min = Long.valueOf(min - diff).intValue();
        }
    }

    public int top() {
        if(stack.isEmpty()){
            return 0;
        }

        long diff = stack.peek();
        long result = diff < 0 ? min : diff + min;
        return Long.valueOf(result).intValue();
    }

    public int getMin() {
        return Long.valueOf(min).intValue();
    }
}
