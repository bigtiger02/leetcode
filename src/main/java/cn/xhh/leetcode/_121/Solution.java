package cn.xhh.leetcode._121;

/**
 * Best time to buy and sell stock
 * <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/">Best time to buy and sell stock</a>
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/24
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(null == prices || prices.length < 2){
            return 0;
        }

        int minValue = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(prices[i]-minValue, maxProfit);
            minValue = Math.min(minValue,prices[i]);
        }
        return maxProfit;
    }
}
