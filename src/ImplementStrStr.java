///**
// * Created on 2020/5/28 11:45 PM
// *
// * @author zzkyeee
// */
//public class ImplementStrStr {
//
//    public int strStr(String haystack, String needle) {
//        if (null == needle || needle.length() == 0) {
//            return 0;
//        }
//        if (null == haystack || haystack.length() == 0) {
//            return -1;
//        }
//        if (haystack.length() < needle.length()) {
//            return -1;
//        }
//        int diff = haystack.length() - needle.length();
//        for (int i = 0; i < diff; i++) {
//            int j;
//            for (j = 0; j < needle.length(); j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)) {
//                    break;
//                }
//            }
//
//            if (j == needle.length()) {
//                return i;
//            }
//        }
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        ImplementStrStr solution = new ImplementStrStr();
//        System.out.println(solution.strStr("a", "a"));
//    }
//
//}
