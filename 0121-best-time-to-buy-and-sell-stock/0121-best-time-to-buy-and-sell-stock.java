class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            } 
            else{
                int potentialProfit = prices[i] - minPrice;
                if (potentialProfit > profit){
                    profit = potentialProfit;
                }
            }
        }
        return profit;
    }
}