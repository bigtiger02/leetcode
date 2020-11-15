package cn.xhh.leetcode._015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 * <a href="https://leetcode-cn.com/problems/3sum/">3sum</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/15
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(null == nums || nums.length < 3){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        if(nums[0] > 0 || nums[nums.length-1] < 0){
            return new ArrayList<>();
        }

        List<List<Integer>> results = new ArrayList<>();
        for (int first = 0; first < nums.length; first++) {
            if(first > 0 && nums[first] == nums[first-1]){
                continue;
            }

            int second = first + 1, third = nums.length-1;
            while(second < third){
                int tmp = nums[first] + nums[second] + nums[third];
                if(tmp == 0){
                    results.add(Arrays.asList(nums[first], nums[second], nums[third]));
                    do{
                        second++;
                    }while(second < third && nums[second-1] == nums[second]);

                    do{
                        third--;
                    }while(second < third && nums[third+1] == nums[third]);
                }else if(tmp > 0){
                    third--;
                }else{
                    second++;
                }
            }
        }

        return results;
    }
}
