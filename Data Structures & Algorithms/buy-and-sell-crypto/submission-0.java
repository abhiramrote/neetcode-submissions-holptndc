class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(prices[i],minPrice);
            max_profit=Math.max(max_profit,prices[i]-minPrice);
        }
        return max_profit;
        
    }
}
