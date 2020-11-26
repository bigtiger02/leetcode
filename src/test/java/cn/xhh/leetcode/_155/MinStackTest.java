package cn.xhh.leetcode._155;

import org.junit.Assert;
import org.junit.Test;

/**
 * MinStackTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/27
 */
public class MinStackTest {

    @Test
    public void case1(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.getMin());
    }

    @Test
    public void case2(){
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        Assert.assertEquals(2147483647, minStack.top());
        minStack.pop();
        Assert.assertEquals(2147483646, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(2147483646, minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        Assert.assertEquals(2147483647, minStack.top());
        Assert.assertEquals(2147483647, minStack.getMin());
        minStack.push(-2147483648);
        Assert.assertEquals(-2147483648, minStack.top());
        Assert.assertEquals(-2147483648, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(2147483647, minStack.getMin());

    }
}
