import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/6/20 12:03 PM
 *
 * @author zzkyeee
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        if (numRows == 0) {
            return res;
        }
        res.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> level = new LinkedList<>();
            List<Integer> lastLevel = res.get(i - 1);
            level.add(1);
            for (int j = 0; j < lastLevel.size() - 1; j++) {
                level.add(lastLevel.get(j) + lastLevel.get(j + 1));
            }
            level.add(1);
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generate(5));
    }

}
