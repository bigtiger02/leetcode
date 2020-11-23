package cn.xhh.leetcode._078;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Subsets
 * <a href="https://leetcode-cn.com/problems/subsets/">Subsets</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/23
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        dfs(0, nums, stack, results);
        return results;
    }

    private void dfs(int index,
                     int[] nums,
                     Stack<Integer> stack,
                     List<List<Integer>> results) {
        if(index == nums.length){
            results.add(new ArrayList<>(stack));
            return;
        }

        stack.push(nums[index]);
        dfs(index+1, nums, stack, results);
        stack.pop();
        dfs(index+1, nums, stack, results);
    }
}

