package seminar1.sm1;

public class ex2 {

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        String res = "";
        int k = 0;
        int j = b.length() - 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                k++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                k++;
            }
            res = k % 2 + res;
            j--;
            k /= 2;
        }
        if (k > 0) {
            res = k + res;
        }
        return res;
    }



}
