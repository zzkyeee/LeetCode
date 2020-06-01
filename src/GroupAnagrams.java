import java.util.*;

/**
 * Created on 2020/6/1 10:38 PM
 *
 * @author zzkyeee
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            char[] arrays = str.toCharArray();
            Arrays.sort(arrays);
            String key = String.valueOf(arrays);
            if (res.containsKey(key)) {
                List<String> list = res.get(key);
                list.add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                res.put(key, list);
            }
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

}
