package seminar2.hw2;

public class hw3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, -7, -6, -5, 31, 13, 5645, 234, -234, 14, -14, 141, 134, 43, -56};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] > 9 && array[i] < 100) || (array[i] > -100 && array[i] < -9)) sum += i;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sum;
            System.out.print(array[i] + " ");
        }
    }
}
