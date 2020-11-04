package cn.xhh.leetcode._941;

/**
 * Solution
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/3
 */
public class Solution2 {

    public boolean validMountainArray(int[] arr) {
        if(null == arr || arr.length < 3 || arr[0] >= arr[1]){
            return false;
        }

        boolean monotonousDirector = true; // 单调递增
        for (int i = 2; i < arr.length; i++) {
            if(monotonousDirector && arr[i] > arr[i-1]){
                continue;
            }else if(!monotonousDirector && arr[i] < arr[i-1]){
                continue;
            }else if(monotonousDirector && arr[i] < arr[i-1]){
                //第一次出现下降的情形
                monotonousDirector = false;
                continue;
            }else{
                //其余不满足单调性
                return false;
            }
        }

        return monotonousDirector ? false : true;
    }
}
