package cn.xhh.leetcode._016;

import java.util.Arrays;

/**
 * 3Sum closest
 * <a href="https://leetcode-cn.com/problems/3sum-closest/">3Sum closest</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/16
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        if(nums.length == 3){
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i-1] == nums[i]){
                continue;
            }

            int l = i + 1, r = nums.length-1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == target){
                    return target;
                }

                if(Math.abs(target - sum) < Math.abs(target - result)){
                    result = sum;

                    while(l < r && l+1 < nums.length && nums[l+1] == nums[l]){
                        l++;
                    }

                    while(l < r && r-1 >= 0 && nums[r-1] == nums[r]){
                        r--;
                    }
                }

                if(sum <= target){
                    l++;
                }else{
                    r--;
                }
            }
        }

        return result;
    }
}
