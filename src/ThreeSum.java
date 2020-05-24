import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/5/24 3:45 PM
 *
 * @author zzkyeee
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        if (nums == null || nums.length < 3) {
            return ans;
        }
        // 先进行排序
        Arrays.sort(nums);
        // 再使用双指针
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            // 去重复
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } else if (sum == 0) {
                    // 需要去重复
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else {
                    r--;
                }
            }
        }

        return ans;
    }

}
