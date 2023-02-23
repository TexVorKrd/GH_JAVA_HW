package seminar4.hw.hw2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {

    public static final Map<Character, Character> CLOSER = Map.of(')', '(', '}', '{', ']', '[');

    public static void main(String[] args) {

        String s = "({[)";

        System.out.println(s);
        System.out.println(isValid(s));
    }

    /**
     * Given a string str containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     *
     * @param str String  1 <= str.length <= 10000, str consists of parentheses only '()[]{}'.
     * @return boolean
     */
    public static boolean isValid(String str) {

        //Длинна строки должна быть четной
//        String str = s;

        if (str == null || str.length() % 2 != 0) return false;

        Map<Character, LinkedList<Integer>> opener = new HashMap<>(3);

        opener.put('(', new LinkedList<>());
        opener.put('{', new LinkedList<>());
        opener.put('[', new LinkedList<>());

        Integer pointer = 0;
        Character charAtPointer;
        while (pointer < str.length()) {

            charAtPointer = str.charAt(pointer);

            if (charAtPointer == '{' || charAtPointer == '(' || charAtPointer == '[') {
                opener.get(charAtPointer).add(pointer);
                pointer++;
            } else {

                //Закрывающая скобка не может быть первой
                if (opener.get(CLOSER.get(charAtPointer)).isEmpty()) return false;

                //Перед закрывающей скобкой стоит открывающая
                Integer openBefore = opener.get(CLOSER.get(charAtPointer)).getLast();

                if (pointer - openBefore == 1) {
                    str = new StringBuilder(str).delete(openBefore, pointer + 1).toString();
                    pointer = openBefore;
                    opener.get(CLOSER.get(charAtPointer)).removeLast();
                }

                // Между открывающей и закрывающей скобками есть содержимое
                else {
                    if (isValid(str.substring(openBefore + 1, pointer))) {
                        str = new StringBuilder(str).delete(openBefore, pointer + 1).toString();
                        pointer = openBefore;
                        opener.get(CLOSER.get(charAtPointer)).removeLast();
                    } else {
                        return false;
                    }
                }
            }
        }

        //Списки открывающих скобок должны быть пустые по завершению прохода
        for (Character key : opener.keySet()) {
            if (!opener.get(key).isEmpty()) {
                return false;
            }
        }

        return true;
    }
}
