import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created on 2020/7/7 10:57 PM
 *
 * @author zzkyeee
 */
public class LRUCache {

    LinkedHashMap<Integer, Integer> cacheMap;

    private int size;

    public LRUCache(int capacity) {
        cacheMap = new LinkedHashMap<>(capacity);
        size = capacity;
    }

    public int get(int key) {
        if (!cacheMap.containsKey(key)) {
            return -1;
        }
        int val = cacheMap.get(key);
        cacheMap.remove(key);
        cacheMap.put(key, val);
        return val;
    }

    public void put(int key, int value) {
        // 判断尺寸大小
        if (cacheMap.containsKey(key)) {
            cacheMap.remove(key);
        }
        if (cacheMap.size() == size) {
            Set<Integer> keySet = cacheMap.keySet();
            cacheMap.remove(keySet.iterator().next());
        }
        cacheMap.put(key, value);
    }

}
