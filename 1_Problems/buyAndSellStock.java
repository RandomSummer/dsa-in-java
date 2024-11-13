public class buyAndSellStock {

    public static int profit(int price[]) {
        int profit = 0;
        int buy_price = Integer.MAX_VALUE;
        int n = price.length;

        for(int i = 1; i < n; i++) {
            int sell_price = price[i];
            if (buy_price < sell_price) {
                profit = Math.max(profit, sell_price-buy_price);
            }
            else {
                buy_price = sell_price;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int price[] = {7, 1,5, 3,6, 4};
        int profit = profit(price);

        System.out.println(profit);
        
    }
}