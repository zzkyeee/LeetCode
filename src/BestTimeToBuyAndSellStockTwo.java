/**
 * Created on 2020/6/20 12:44 PM
 *
 * @author zzkyeee
 */
public class BestTimeToBuyAndSellStockTwo {

    /**
     * 买卖股票的最佳时机 II
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
        int maxValue = 0;
        for (int i = 1; i < prices.length; i++) {
            // 比最大值还要大的时候
            int diff = prices[i] - minValue;
            if (maxValue <= diff) {
                maxValue = diff;
            } else {
                // 比最大值还小，则卖出，重新开始购买
                res += maxValue;
                maxValue = 0;
                minValue = prices[i];
            }
        }

        return res + maxValue;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockTwo solution = new BestTimeToBuyAndSellStockTwo();
        solution.maxProfit(new int[]{2, 1, 2, 0, 1});
    }
}
