package seminar1.hw1;

//Given an input string s, reverse the order of the words.
//        Example 1:
//
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"
//        Example 2:
//
//        Input: s = "  hello world  "
//        Output: "world hello"
//        Explanation: Your reversed string should not contain leading or trailing spaces.
//        Example 3:
//
//        Input: s = "a good   example"
//        Output: "example good a"
//        Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

public class hw1 {

    public static void main(String[] args) {
//        String s = "the sky is blue";
//        String s="  hello world  ";
        String s="a good   example";

        System.out.println((new StringBuilder().append("[").append(s).append("] -> [").append(revers(s)).append("]").toString()));
    }

    public static String revers(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        while (str.lastIndexOf(" ") != -1) {
            str = str.trim();
            stringBuilder.append(str.substring(str.lastIndexOf(" ") + 1)).append(" ");
            str = str.replace(str.substring(str.lastIndexOf(" ")), "");
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
