package cn.xhh.leetcode._04;

/**
 * Median of Two Sorted Arrays
 * <a href="https://leetcode-cn.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/10/31
 */
public class Solution {
    public double findMedianSortedArrays(int[] numbers1, int[] numbers2) {
        if(numbers1.length > numbers2.length){
            return findMedianSortedArrays(numbers2, numbers1);
        }

        if(0 == numbers1.length && 0 != numbers2.length){
            int median = numbers2.length / 2;
            return numbers2.length % 2 == 1 ? numbers2[median]
                    : (numbers2[median-1] + numbers2[median]) / 2.0d;
        }

        int len1 = numbers1.length;
        int len2 = numbers2.length;
        int median = (len1 + len2 + 1) / 2;

        int left = 0, right = len1;
        int leftMaxVal = 0, rightMinVal = 0;
        while(left <= right){
            int leftDivider = (right + left)/2;
            int rightDivider = median - leftDivider;

            int leftNumber1Max = leftDivider == 0 ? Integer.MIN_VALUE : numbers1[leftDivider - 1];
            int leftNumber2Max = rightDivider == 0 ? Integer.MIN_VALUE : numbers2[rightDivider - 1];
            int rightNumber1Min = leftDivider == len1 ? Integer.MAX_VALUE : numbers1[leftDivider];
            int rightNumber2Min = rightDivider == len2 ? Integer.MAX_VALUE : numbers2[rightDivider];

            if(leftNumber1Max > rightNumber2Min){
                //表明划分的太大，leftDivider 向左移
                right = leftDivider - 1;
            }else {//划分合适或太小 leftDivider 向右移
                left = leftDivider + 1;
                leftMaxVal = Math.max(leftNumber1Max,leftNumber2Max);
                rightMinVal = Math.min(rightNumber1Min, rightNumber2Min);
            }
        }

        return (len1 + len2) % 2 == 1 ? leftMaxVal : (leftMaxVal + rightMinVal) / 2.0d;
    }

}
