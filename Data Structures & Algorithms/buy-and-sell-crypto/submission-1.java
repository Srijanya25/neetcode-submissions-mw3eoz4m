public class Solution{
    public static int maxProfit(int[] prices) {
        int left = 0;  
        int right = 1;  
        int maxProfit = 0;
         while (right < prices.length) {
            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {10, 1, 5, 6, 7, 1};
        System.out.println(maxProfit(prices)); 
    }
}