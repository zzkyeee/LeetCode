/**
 * Created on 2020/6/20 12:14 PM
 *
 * @author zzkyeee
 */
public class BestTimeToBuyAndSellStock {

    /**
     * 买卖股票的最佳时机
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minValue = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= minValue) {
                minValue = prices[i];
            } else {
                res = Math.max(res, prices[i] - minValue);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        solution.maxProfit(new int[]{7, 2, 7, 1, 8, 4});
    }

}
