package cn.xhh.leetcode._042;

import java.util.Arrays;

/**
 * Solution
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/8
 */
public class Solution {

    public int trap(int[] height) {
        if(null == height || height.length < 2){
            return 0;
        }

        int len = height.length;
        int[] maxLefts = new int[len];
        Arrays.fill(maxLefts,0);
        maxLefts[0] = height[0];

        int[] maxRights = new int[len];
        Arrays.fill(maxRights,0);
        maxRights[len-1] = height[len-1];

        for (int i = 1; i < len; i++) {
            maxLefts[i] = Math.max(maxLefts[i-1], height[i]);
        }

        for (int i = len-2; i >= 0; i--) {
            maxRights[i] = Math.max(maxRights[i+1], height[i]);
        }

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Math.min(maxLefts[i],maxRights[i]) - height[i];
        }

        return sum;
    }
}
