package ArrayArrayList;

import static java.lang.Math.max;

public class BuySellStock {
//    public static int maxProfit(int[] prices) {
//        int maxProfit=0;
//        int n = prices.length;
//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                int curr_Profit = prices[j] - prices[i];
//                maxProfit = max(maxProfit, curr_Profit);
//            }
//        }
//        return maxProfit;
//    }

        public static int maxProfit(int[] prices) {
        int buy = prices[0], sell=0, maxProfit=0; ;
        int n = prices.length;
        int i=1;
        while(i<n){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                sell = prices[i];
                int tempProfit = (sell-buy);
                maxProfit = max(tempProfit,maxProfit);
            }
            i++;
        }
        return maxProfit;
    }

    static void main() {
        int [] prices  = {7,1,5,3,6,4};
        int max = maxProfit(prices);
        System.out.println("Max profit is: "+max);

    }
}
