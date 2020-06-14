import model.TreeNode;

/**
 * Created on 2020/6/14 9:44 PM
 *
 * @author zzkyeee
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();
        solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    }

}
