package cn.xhh.leetcode._922;

/**
 * Sort array by parity ii
 * <a href="https://leetcode-cn.com/problems/sort-array-by-parity-ii/">Sort array by parity ii</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/12
 */
public class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        if(null == arr || arr.length < 2){
            return arr;
        }

        int i = 0, j = 1, tmp = 0;
        while(i < arr.length){
            if((arr[i]&1) == 0){
                i+=2;
            }else if((arr[j]&1) == 1){
                j+=2;
            }else {
                tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                i+=2;
                j+=2;
            }
        }
        return arr;
    }
}
