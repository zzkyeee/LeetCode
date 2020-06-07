/**
 * Created on 2020/6/7 4:58 PM
 *
 * @author zzkyeee
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i++] = nums[l];
                nums[l++] = temp;
            }  else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r--] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        sortColors.sortColors(new int[] {2,0,2,1,1,0});
    }
}
