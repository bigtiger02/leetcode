package cn.xhh.leetcode._033;

/**
 * Search in rotated sorted array
 * <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/">Search in rotated sorted array</a>

 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/18
 */
public class Solution {

    public int search(int[] nums, int target) {
        if(nums.length == 1){
            return nums[0] == target ? 0 : -1;
        }

        int l = 0, r = nums.length - 1;
        int index = -1;
        while(l < r){
            int mid = (r+l+1)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target == nums[l]){
                return l;
            }else if(target == nums[r]){
                return r;
            }

            if(nums[l] < nums[mid]){
                if(target > nums[l] && target < nums[mid]){
                    r = mid - 1;
                }else{
                    l= mid + 1;
                }
            }else {
                if(target > nums[mid] && target < nums[r]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }

        return index;
    }
}
