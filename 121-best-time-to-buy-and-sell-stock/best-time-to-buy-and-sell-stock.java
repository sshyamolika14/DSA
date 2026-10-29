class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;
    
        for (int i = 1 ; i<prices.length; i++){
            minSoFar = Math.min(minSoFar , prices[i]);
            res = Math.max(res , prices[i] - minSoFar);
        }
            return res;
        }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna