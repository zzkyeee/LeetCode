import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/5/18 10:50 PM
 *
 * @author zzkyeee
 */
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{0, 0};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{0, 0};
    }


}
