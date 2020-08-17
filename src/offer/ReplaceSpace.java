package offer;

/**
 * Created on 2020/8/17 8:34 AM
 *
 * @author zzkyeee
 */
public class ReplaceSpace {

    StringBuilder sb = new StringBuilder();

    public String replaceSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

}
