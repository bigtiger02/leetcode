package cn.xhh.leetcode._122;

/**
 * Best time to buy and sell stock ii
 * <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/">Best time to buy and sell stock ii</a>
 *
 * @author <a href="mailto:bigtiger02@gmail.com">xhh</a>
 * @date 2020/11/13
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(null == prices || prices.length < 2){
            return 0;
        }

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]){//单调递增
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
    }
}
