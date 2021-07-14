//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//Example 1:
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

//Example 2:
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {7,1,5,3,6,4};
		System.out.println(maxProfit(intArray));
		
		int[] intArray1 = {7,6,4,3,1};
		System.out.println(maxProfit(intArray1));
		
	}
	//---------wrong method but good thought as per given description------------//
//	public static int maxProfit(int[] prices) {
//		List<Integer> priceslist = new ArrayList<Integer>();
//		int a=0;
//	       for(int i=prices.length-1;i>0;i--) {
//	    	   for(int j=i-1;j>=0;j--) {
//	    		   a = prices[i]-prices[j];
//	    		   priceslist.add(a);
//	    	   }
//	       }
//	       System.out.println(priceslist);
//	       if(Collections.max(priceslist)>0) {
//	    	   return Collections.max(priceslist);
//	       }else {
//	    	   return 0;
//	       }
	public static int maxProfit(int[] prices) {
		int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];   //takes the minimum value of the array
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
	}
	    
}
