package cn.xhh.leetcode._217;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains duplicate
 * <a href="https://leetcode-cn.com/problems/contains-duplicate/">Contains duplicate</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/29
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}
