class Solution {
    public int maxProfit(int[] prices) {
        //Get maximum profit

        //Buy buy>sell - > left++
        // buy==sell -. right
        // buy<sell -> right

        int left = 0;
        int right = 1;
        int max = 0;

        while(right<prices.length){
            int buy = prices[left];
            int sell = prices[right];
            if(buy>sell){
                left=right;
                right++;
            }
            else{
                max = Math.max(max, sell-buy);
                right++;
            }
        }
        return max;

        
    }
}
