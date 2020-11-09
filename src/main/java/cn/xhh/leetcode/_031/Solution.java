package cn.xhh.leetcode._031;

/**
 * Next Permutation
 * <a href="https://leetcode-cn.com/problems/next-permutation/">Next Permutation</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/10
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        if(null == nums || nums.length < 2){
            return;
        }

        int l = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if(nums[i] > nums[i-1]){
                l = i - 1;
                break;
            }
        }

        int r = nums.length-1;
        if(-1 != l){
            //查找 r
            for (int i = nums.length - 1; i > l; i--) {
                if(nums[i] > nums[l]){
                    r = i;
                    break;
                }
            }

            //交换
            swap(nums, l, r);
        }
        //倒序排序
        l = l + 1;
        r = nums.length - 1;
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int l, int r){
        int tmp = nums[r];
        nums[r] = nums[l];
        nums[l] = tmp;
    }
}
