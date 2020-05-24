import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created on 2020/5/24 4:23 PM
 *
 * @author zzkyeee
 */
public class LetterCombinationsOfPhoneNumber {

    private Map<String, String> phoneNumberMap = new HashMap<>();

    private List<String> res = new LinkedList<>();

    {
        phoneNumberMap.put("2", "abc");
        phoneNumberMap.put("3", "def");
        phoneNumberMap.put("4", "ghi");
        phoneNumberMap.put("5", "jkl");
        phoneNumberMap.put("6", "mno");
        phoneNumberMap.put("7", "pqrs");
        phoneNumberMap.put("8", "tuv");
        phoneNumberMap.put("9", "wxyz");
    }


    public List<String> letterCombinations(String digits) {
        if (null == digits || digits.length() == 0) {
            return res;
        }
        backTrack(digits, "");
        return res;
    }

    private void backTrack(String digits, String path) {
        if ("".equals(digits)) {
            res.add(path);
            return;
        }

        // 当前数字
        String currNumber = digits.substring(0, 1);
        String nextDigits = digits.substring(1);
        String numbers = phoneNumberMap.get(currNumber);
        for (int i = 0; i < numbers.length(); i++) {
            backTrack(nextDigits, path + numbers.charAt(i));
        }
    }

    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber solution = new LetterCombinationsOfPhoneNumber();
        solution.letterCombinations("23");
    }

}
