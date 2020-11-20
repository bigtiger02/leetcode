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
        List<List<Integer>> results = new ArrayList<>();
        if(0 == nums.length){
            return results;
        }

        Set<Integer> path = new LinkedHashSet<>();
        dfs(nums, path, results);
        return results;
    }

    private void dfs(int[] nums,
                     Set<Integer> path,
                     List<List<Integer>> results) {
        if(nums.length == path.size()){
            results.add(new ArrayList<>(path));
            return;
        }

        for (int num : nums) {
            if (!path.contains(num)) {
                path.add(num);
                dfs(nums, path, results);
                path.remove(num);
            }
        }
    }
}
