package cn.xhh.leetcode._128;

import java.util.HashMap;
import java.util.Map;

/**
 * longest-consecutive-sequence
 * <a href="https://leetcode-cn.com/problems/longest-consecutive-sequence/">longest-consecutive-sequence</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/27
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }

        Map<Integer,Integer> numMap = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!numMap.containsKey(nums[i])){
                int left = numMap.getOrDefault(nums[i]-1,0);
                int right = numMap.getOrDefault(nums[i]+1,0);
                int len = left + right + 1;
                maxLen = Math.max(maxLen, len);
                numMap.put(nums[i], len);
                numMap.put(nums[i]-left, len);
                numMap.put(nums[i]+right, len);
            }
        }

        return maxLen;
    }
}
