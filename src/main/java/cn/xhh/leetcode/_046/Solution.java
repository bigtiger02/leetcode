package cn.xhh.leetcode._046;

import java.util.*;

/**
 * Permutations
 * <a href="https://leetcode-cn.com/problems/permutations/">Permutations</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/19
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        if(null == nums){
            return new ArrayList<>();
        }

        return dfs(new ArrayList<>(),0, nums);
    }

    private List<List<Integer>> dfs(List<Integer> result ,int flag, int[] nums){
        List<List<Integer>> results = new ArrayList<>();
        if(flag == (1 << nums.length) - 1){
            results.add(result);
            return results;
        }

        for (int i = 0; i < nums.length; i++) {
            if(1 == (flag >> i & 1)){
                continue;
            }

            List<Integer> tmp = new ArrayList<>(result);
            tmp.add(nums[i]);
            flag = flag | (1 << i);
            List<List<Integer>> tResults = dfs(tmp, flag, nums);
            results.addAll(tResults);
        }
        return results;
    }
}
