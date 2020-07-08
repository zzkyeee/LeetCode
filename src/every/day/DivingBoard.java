package every.day;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Created on 2020/7/8 8:26 AM
 *
 * @author zzkyeee
 */
public class DivingBoard {

    public int[] divingBoard(int shorter, int longer, int k) {

        if (k == 0) {
            return new int[]{};
        }

        if (shorter == longer) {
            return new int[]{shorter * k};
        }

        int[] res = new int[k + 1];

        for (int i = 0; i <= k; i++) {
            res[i] = (k - i) * shorter + i * longer;
        }

        return res;
    }


    public static void main(String[] args) {
        DivingBoard divingBoard = new DivingBoard();
        divingBoard.divingBoard(1, 2, 3);
    }
}
