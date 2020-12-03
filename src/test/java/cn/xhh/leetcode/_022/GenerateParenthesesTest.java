package cn.xhh.leetcode._022;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * GenerateParenthesesTest
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class GenerateParenthesesTest {
    private Solution solution = new Solution();

    @Test
    public void case1(){
        List<String> results = solution.generateParenthesis(3);
        Assert.assertArrayEquals(new String[]{
                        "((()))",
                        "(()())",
                        "(())()",
                        "()(())",
                        "()()()"
                },
                results.toArray(new String[0]));
    }
}
