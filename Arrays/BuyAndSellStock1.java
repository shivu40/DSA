class Solution {
    public int maxProfit(int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int todayProfit = 0;
        int totalProfit = 0;
        
        for(int i = 0; i < prices.length; i++){
            leastSoFar = Math.min(prices[i], leastSoFar);
            todayProfit = prices[i] - leastSoFar;
            totalProfit = Math.max(totalProfit, todayProfit);
        }
        
        return totalProfit;
    }
}