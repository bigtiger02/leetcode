package cn.xhh.leetcode._034;

/**
 * find-first-and-last-position-of-element-in-sorted-array
 * <a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">find-first-and-last-position-of-element-in-sorted-array</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(null == nums || nums.length == 0){
            return new int[]{-1,-1};
        }

        int len = nums.length;
        if(nums[0] > target || nums[len-1] < target){
            return new int[]{-1,-1};
        }

        if(nums[0] == target && nums[len-1] == target){
            return new int[]{0,len-1};
        }

        int firstIndex = -1;
        int left = 0, right = nums.length-1;
        while(left < right){
            int index = (right+left)/2;
            if(nums[index] < target){
                left = index+1;
            }else if(nums[index] > target){
                right = index;
            }else{
                if(index == 0 || nums[index-1] < target){
                    firstIndex = index;
                    break;
                }else{
                    right = index;
                }
            }
        }

        if(firstIndex == -1){
            firstIndex = nums[left] == target ? left : -1;
        }

        if(firstIndex == -1){
            return new int[]{-1,-1};
        }

        int lastIndex = firstIndex;
        left = firstIndex;
        right = len-1;
        while(left < right){
            int index = (right+left+1)/2;
            if(nums[index] > target){
                right = index-1;
            }else{
                if(index == len-1 || nums[index+1] > target){
                    lastIndex = index;
                    break;
                }else{
                    left = index;
                }
            }
        }
        return new int[]{firstIndex, lastIndex};
    }
}
