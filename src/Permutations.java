import java.util.*;

/**
 * Created on 2020/5/31 1:09 PM
 *
 * @author zzkyeee
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (null == nums || nums.length == 0) {
            return res;
        }
        List<Integer> paths = new LinkedList<>();
        backTrack(nums, paths, res);
        return res;
    }


    private void backTrack(int[] nums, List<Integer> paths, List<List<Integer>> res) {
        if (paths.size() == nums.length) {
            res.add(new LinkedList<>(paths));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (paths.contains(nums[i])) {
                continue;
            }
            paths.add(nums[i]);
            backTrack(nums, paths, res);
            paths.remove(paths.size() - 1);
        }
    }

}
