package cn.xhh.leetcode._020;

import java.util.Stack;

/**
 * Valid Parentheses
 * <a href="https://leetcode-cn.com/problems/valid-parentheses/">Valid Parentheses</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/16
 */
public class Solution {
    public boolean isValid(String s) {
        if(null == s || s.length() == 0){
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if('(' == c || '[' == c || '{' == c){
                stack.push(c);
            }else {
                if(')' == c){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }else if(']' == c){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }else if('}' == c){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
