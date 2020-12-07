package cn.xhh.leetcode._069;

/**
 * sqrtx
 * <a href="https://leetcode-cn.com/problems/sqrtx/">sqrtx</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/12/4
 */
public class Solution {
    public int mySqrt(int x) {
        if(x <= 1){
            return x;
        }

        long left = 1; long right = x/2;
        while(left < right){
            long tmp = (left + right+1)/2;
            long tResult = tmp*tmp*1L;
            if(tResult < x){
                if(tmp == left){
                    break;
                }else{
                    left = tmp;
                }
            }else if(tResult > x){
                if(tmp == right){
                    break;
                }else{
                    right = tmp;
                }
            }else{
                left = tmp;
                break;
            }
        }

        return Long.valueOf(left).intValue();
    }
}
