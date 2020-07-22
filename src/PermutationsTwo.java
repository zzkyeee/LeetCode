import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/7/22 11:12 PM
 *
 * @author zzkyeee
 */
public class PermutationsTwo {

    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        backTrack(nums, new LinkedList<>(), visited);
        return res;
    }

    private void backTrack(int[] nums, List<Integer> paths, boolean[] visited) {
        if (paths.size() == nums.length) {
            res.add(new LinkedList<>(paths));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]) || visited[i]) {
                continue;
            }
            visited[i] = true;
            set.add(nums[i]);
            paths.add(nums[i]);
            backTrack(nums, paths, visited);
            paths.remove(paths.size() - 1);
            visited[i] = false;
        }
    }

}
