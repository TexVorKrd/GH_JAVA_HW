package seminar3.hw.hw3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String strFilter = "а";
        Integer dateFilter = 2010;

        Book book1 = new Book("Книга1", "Петров", 100.2, 2009, 117);
        Book book2 = new Book("Книга2", "Иванов", 100.2, 2010, 7);
        Book book3 = new Book("Книга3", "Сидоров", 100.2, 2009, 1000);
        Book book4 = new Book("Книга4", "Афанасьев", 100.2, 2019, 2000);
        Book book5 = new Book("Книга5", "Петров", 100.2, 1978, 17);
        Book book6 = new Book("Книга6", "Агапов", 100.2, 2003, 117);
        Book book7 = new Book("Книга7", "Павлов", 100.2, 2020, 31);
        Book book8 = new Book("Книга8", "Сидоркнко", 100.2, 2021, 47);

        List<Book> items = List.of(book1, book2, book3, book4, book5, book6, book7, book8);

        List<String> bookNames = items.stream()
                .filter(a -> isPrimeNum(a.getPages()))
                .filter(a -> a.getFamily().toLowerCase().contains(strFilter))
                .filter(a -> a.getPublcated() >= dateFilter)
                .map(a -> a.getName())
                .collect(Collectors.toList());
        for (String bookName : bookNames) {
            System.out.println(bookName);
        }
    }

    /**
     * Проверяет число на простоту, возвращает true если число простое
     *
     * @param a - проверяемое число типа int
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
