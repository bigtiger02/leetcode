package cn.xhh.leetcode._941;

/**
 * Solution
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/3
 */
public class Solution {

    public boolean validMountainArray(int[] arr) {
        if(null == arr || arr.length < 3){
            return false;
        }

        int left = 0, right = arr.length-1;
        while(left < right){
            if(arr[left] < arr[left+1]){
                left++;
            }else if(arr[right] < arr[right-1]){
                right--;
            }else{
                break;
            }
        }
        return 0 != left && right != arr.length -1 && left == right;
    }
}
