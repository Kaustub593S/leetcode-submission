class Solution {

    //using left right pointer

    public int maxProfit(int[] prices) {

        int left=0;
        int right=1;
        int maxprofit=0;

        while(right<prices.length)
        {
            int profit=prices[right]-prices[left];
            maxprofit=Math.max(profit,maxprofit);
            if(profit<0)
            left=right;

            right++;
        }
        return maxprofit;

    }
}
