package seminar2.hw2;

public class hw2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Последовательность возрастает - " + isRice(array));
    }

    /**
     * Возвращает true если каждый элеммент массива начиная со второго больше предыдущего.
     * Возвращет false если не выполняется условие 1 или последовательностьне существует или состоит
     * из одного элеммента
     *
     * @param array - int[]
     * @return - boolean
     */
    public static boolean isRice(int[] array) {

        if (array == null || array.length < 2) return false;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) return false;
        }
        return true;
    }
}
