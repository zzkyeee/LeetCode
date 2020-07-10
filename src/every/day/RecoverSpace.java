package every.day;

/**
 * Created on 2020/7/9 11:49 PM
 *
 * @author zzkyeee
 */
public class RecoverSpace {

    public int respace(String[] dictionary, String sentence) {
        int start = 0;
        int res = 0;
        for (int i = 1; i <= sentence.length(); i++) {
            String curr = sentence.substring(start, i);
            int index = contains(curr, dictionary);
            if (index > 0) {
                res += index;
                start = i;
            } else if (index == 0) {
                start = i;
            }

            if (i == sentence.length() && index == -1) {
                res += curr.length();
            }
        }

        return res;
    }

    private int contains(String target, String[] dictionary) {
        int index = target.length();
        for (String dict : dictionary) {
            int temp = target.indexOf(dict);
            if (temp >= 0) {
                index = Math.min(index, temp);
            }
        }

        return index == target.length() ? -1 : index;
    }

    public static void main(String[] args) {
        RecoverSpace recoverSpace = new RecoverSpace();
        recoverSpace.respace(new String[]{"jxnonurhhuanyuqahjy", "phrxu", "hjunypnyhajaaqhxduu"},
                "qahurhoharrdjxnonurhhuanyuqahjyppnha");
    }

}
