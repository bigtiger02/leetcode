package cn.xhh.leetcode._001;

import java.util.HashMap;
import java.util.Map;

/**
 *  Two Sum
 * @see <a href="https://leetcode-cn.com/problems/two-sum/">Two Sum</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numberMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer index = numberMap.get(target - nums[i]);
            if(null != index){
                return new int[]{index,i};
            }
            numberMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
