package cn.xhh.leetcode._04;

/**
 * Median of Two Sorted Arrays
 * <a href="https://leetcode-cn.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class Solution {
    public double findMedianSortedArrays(int[] numbers1, int[] numbers2) {
        if(0 == numbers1.length && 0 == numbers2.length){
            return 0;
        }

        if(0 == numbers1.length && 0 != numbers2.length){
            int median = numbers2.length/2;
            return median % 2 == 1 ? numbers2[median] : (numbers2[median-1] + numbers2[median]) / 2.0d;
        }

        if(0 != numbers1.length && 0 == numbers2.length){
            int median = numbers1.length/2;
            return median % 2 == 1 ? numbers1[median] : (numbers1[median-1] + numbers1[median]) / 2.0d;
        }

        int len1 = numbers1.length;
        int len2 = numbers2.length;
        int median = (len1 + len2) / 2;
        //TODO
        return 0;
    }

}
