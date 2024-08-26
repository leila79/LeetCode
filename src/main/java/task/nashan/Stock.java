package task.nashan;

public class Stock {
    public int maxProfit(int[] prices) {
       int buyPrice = 10001;
       int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            } else if (prices[i] - buyPrice > maxProfit) {
                maxProfit = prices[i] - buyPrice;
            }
        }
        return maxProfit;
    }
    public int maxProfit_two(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i-1] < prices[i]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}
