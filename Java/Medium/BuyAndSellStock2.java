class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int profit = 0;
        int i = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            buy = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i+1])
                i++;
            sell = prices[i];
            profit += sell - buy;
            i++;
        }
        return profit;
    }
}
