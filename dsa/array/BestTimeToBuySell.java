class Solution {
    public int maxProfit(int[] prices) {

        int minIndex=0;
        int maxIndex=prices.length-1;
        if(prices.length==1){
            return 0;
        }
        int minValue=prices[0];
        int maxValue= prices[prices.length-1];
        int profit=0;

        for(int i=1;i< prices.length;i++){
           if(prices[i] < minValue) {
               
               if(minIndex < maxIndex){
                   if((maxValue-minValue) > profit)
                   {
                       profit = maxValue-minValue;
                   } 
               }
               maxValue= prices[prices.length-1];
               maxIndex=prices.length-1; 
               minValue = prices[i];
               minIndex=i;
           }
           if(prices[i] >= maxValue) {
               maxValue = prices[i];
               maxIndex=i;
           }
     
        }
        if( minIndex<maxIndex && (maxValue-minValue) > profit)
        {
            profit = maxValue-minValue;
        }
        return profit;
    }
}
