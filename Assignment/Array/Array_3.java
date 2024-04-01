package Array;
//Buy and Sell Stocks

public class Array_3 {
    public static int buyAndSell(int prices[]){
        int buyPrices=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){  //O(n)
            if(buyPrices<prices[i]){
                int profit=prices[i]-buyPrices;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrices=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices1[]={7, 1, 5, 3, 6,  4};
        System.out.println("Max Profit in stock is: " +buyAndSell(prices1));
        int prices2[]={7, 6, 4,  3, 1};
        System.out.println("Max Profit in stock is: " +buyAndSell(prices2));
    }
    
}
