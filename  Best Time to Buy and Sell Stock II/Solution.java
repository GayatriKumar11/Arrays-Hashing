// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int n: prices)
        {
            int temp = n-min;
            if(temp>maxProfit)
            maxProfit=temp;

            if(n<min)
            min=n;
        }

        return maxProfit;
    }
}