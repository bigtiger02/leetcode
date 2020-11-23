package cn.xhh.leetcode._088;

/**
 * Merge Sorted Array
 * <a href="https://leetcode-cn.com/problems/merge-sorted-array/">Merge Sorted Array</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/23
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(0 == n){
            return;
        }

        int index = m + n -1;
        int i = m-1, j = n-1;
        while(index >= 0){
            int num1 = i >= 0 ? nums1[i] : Integer.MIN_VALUE;
            int num2 = j >= 0 ? nums2[j] : Integer.MIN_VALUE;
            if(num1 < num2){
                nums1[index--] = num2;
                j--;
            }else{
                nums1[index--] = num1;
                i--;
            }
        }
    }
}
