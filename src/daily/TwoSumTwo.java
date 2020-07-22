package daily;

/**
 * Created on 2020/7/20 11:00 PM
 *
 * @author zzkyeee
 */
public class TwoSumTwo {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] {-1, -1};
    }

}
