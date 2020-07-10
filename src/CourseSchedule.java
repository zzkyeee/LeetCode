import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created on 2020/7/10 7:44 AM
 *
 * @author zzkyeee
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 入度
        int[] indegrees = new int[numCourses];
        List<List<Integer>> adjacency = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            adjacency.add(new LinkedList<>());
        }

        // 初始化所有入度
        for (int i = 0; i < prerequisites.length; i++) {
            int out = prerequisites[i][1];
            indegrees[out] = indegrees[out] + 1;
            adjacency.get(prerequisites[i][0]).add(out);

        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer curr = queue.poll();
            // 所有出度都-1
            for(int cur : adjacency.get(curr)) {
                if(--indegrees[cur] == 0) {
                    queue.offer(cur);
                }
            }

            numCourses--;
        }

        return numCourses == 0;
    }

    public static void main(String[] args) {
        CourseSchedule courseSchedule = new CourseSchedule();
        System.out.println(courseSchedule.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

}
