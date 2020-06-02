import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/6/2 12:07 AM
 *
 * @author zzkyeee
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // 默认升序
        if (intervals == null || intervals.length == 0) {
            return new int[][]{};
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new LinkedList<>();
        int i = 1;
        int[] curr = intervals[0];
        while (i < intervals.length) {
            if (curr[1] >= intervals[i][0]) {
                curr = new int[]{curr[0], Math.max(curr[1], intervals[i][1])};
            } else {
                res.add(new int[]{curr[0], curr[1]});
                curr = intervals[i];
            }
            i++;
        }
        res.add(new int[]{curr[0], curr[1]});
        return res.toArray(new int[res.size()][2]);
    }

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] array = new int[][]{{1, 4}, {0, 2}, {3, 5}};
    }
}
