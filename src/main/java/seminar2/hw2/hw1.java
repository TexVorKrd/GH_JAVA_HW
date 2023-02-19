package seminar2.hw2;

import java.util.HashMap;
import java.util.Map;


public class hw1 {
    public static void main(String[] args) {

        Map<Integer, Boolean> myPrimary = new HashMap<>();
        double sum = 0;

        int[] myArray = {2, 3, 5, 7, 4, 8, 149, 19, 23, 29, 982_451_653, 7, 25};

        for (int element : myArray) {
            if (myPrimary.containsKey(element)) {
                sum += element;
            } else {
                if (isPrimeNum(element)) {
                    myPrimary.put(element, true);
                    sum += element;
                }
            }
        }
        System.out.println("SUM Prime Num= " + sum);
    }

    /**
     * Принимает целое число и возвращает true если число простое или false в противном случае
     *
     * @param a - int целое число int
     * @return - boolean
     */
    public static boolean isPrimeNum(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}