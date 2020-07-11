import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created on 2020/7/11 5:35 PM
 *
 * @author zzkyeee
 */
public class CourseScheduleTwo {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegrees = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            inDegrees[prerequisites[i][1]] = inDegrees[prerequisites[i][1]] + 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }

        Stack<Integer> res = new Stack<>();

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            res.push(curr);
            for (int[] nums : prerequisites) {
                if (nums[0] == curr) {
                    // 当前入度的数字-1
                    if (--inDegrees[nums[1]] == 0) {
                        queue.offer(nums[1]);
                    }
                }
            }
            numCourses--;
        }
        if (numCourses == 0) {
            int[] resArray = new int[inDegrees.length];
            for (int i = 0; i < inDegrees.length; i++) {
                resArray[i] = res.pop();
            }
            return resArray;
        }
        return new int[]{};
    }

}
