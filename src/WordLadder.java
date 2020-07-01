import javafx.util.Pair;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created on 2020/6/27 7:06 PM
 *
 * @author zzkyeee
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        boolean[] visited = new boolean[wordList.size()];
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(beginWord, 1));
        while (!queue.isEmpty()) {
            Pair<String, Integer> curr = queue.poll();
            if (curr.getKey().equals(endWord)) {
                return curr.getValue();
            }

            for (int i = 0; i < wordList.size(); i++) {
                if (!visited[i] && onlyOneWordDiff(curr.getKey(), wordList.get(i))) {
                    queue.add(new Pair<>(wordList.get(i), curr.getValue() + 1));
                    visited[i] = true;
                }
            }
        }

        return 0;
    }

    private boolean onlyOneWordDiff(String source, String target) {
        int diff = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) != target.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }

}
