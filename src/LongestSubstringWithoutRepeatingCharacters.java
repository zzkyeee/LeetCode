import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2020/5/20 12:39 AM
 *
 * @author zzkyeee
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        Set<Character> set = new HashSet<>();

        int maxLength = 0;

        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (r < s.length() && !set.contains(s.charAt(r))) {
                set.add(s.charAt(r++));
            }

            maxLength = Math.max(maxLength, set.size());
        }

        return maxLength;
    }


}
