package cn.xhh.leetcode._091;

/**
 * Decode ways
 * <a href="https://leetcode-cn.com/problems/decode-ways/"></a>
 * @author <a href="mailto:bigtiger02@gmail.com">Decode ways</a>
 * @date 2020/12/17
 */
public class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0'){
            return 0;
        }

        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 1; i < len; i++) {
            int num = s.charAt(i) - '0';
            int lastNum = s.charAt(i-1) - '0';
            int totalNum = lastNum*10 + num;
            //既可以与前一个凑，也可以和后一个凑
            //只能单独使用
            //只能和前一个凑
            //不能凑
            if(num > 0 && num < 7 && totalNum > 0 && totalNum <= 26){
                dp[i+1] = dp[i] + dp[i-1];
            }else if(totalNum == 10 || totalNum == 20 || totalNum > 26){
                dp[i+1] = dp[i];
            }else{
                return 0;
            }
            //只能和前一个凑
            //不能凑
            if(num == 0){
                if(totalNum == 10 || totalNum == 20){
                    //还可以和前一个凑
                    dp[i+1] = dp[i-1];
                }else{
                    return 0;
                }
            }else{
                if(totalNum > 10 && totalNum <= 26){
                    //表明该数字既可以单独又可以和前一个组合
                    dp[i+1] = dp[i] + dp[i+1];
                }else{
                    //和前一个数字无法组合
                    dp[i+1] = dp[i];
                }
            }
        }

        return dp[len];
    }
}
