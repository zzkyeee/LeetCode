import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/6/7 6:00 PM
 *
 * @author zzkyeee
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backTrack(int[] nums, int start, List<Integer> paths, List<List<Integer>> res) {
        res.add(new LinkedList<>(paths));
        for (int i = start; i < nums.length; i++) {
            paths.add(nums[i]);
            backTrack(nums, i + 1, paths, res);
            paths.remove(paths.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        System.out.println(subsets.subsets(new int[] {1, 2, 3}));
    }

}
