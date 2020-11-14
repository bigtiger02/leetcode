package cn.xhh.leetcode._011;

/**
 * Container with most water
 * <a href="https://leetcode-cn.com/problems/container-with-most-water/">Container with most water</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/14
 */
public class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int result = 0, tmp = 0;
        while(l < r){
            if(height[l] < height[r]){
                tmp = height[l] * (r - l);
                l++;
            }else{
                tmp = height[r] * (r - l);
                r--;
            }

            result = Math.max(tmp, result);
        }
        return result;
    }
}
