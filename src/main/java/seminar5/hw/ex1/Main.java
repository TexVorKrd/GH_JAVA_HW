package seminar5.hw.ex1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String str = "Россия идет вперед всей                планеты. Планета — это не Россия.";

        wordsCounter(str);
    }

    /**
     * Печатаем слова и количество их повторов в строке без учета регистра.
     * Знаки препинания не считаются
     * @param str
     */
    public static void wordsCounter(String str) {

        // Символы для удаления
        String forDel = ",.:;!?—";

        //Удаляем все симфолы для удаления
        for (int i = 0; i < forDel.length(); i++) {
            str = str.replace(forDel.substring(i, i + 1), "");
        }

        Map<String, Integer> wordsCount = new HashMap<>();

        for (String key : str.toLowerCase().replaceAll("\\s+", " ").split(" ")) {
            wordsCount.put(key, wordsCount.getOrDefault(key, 0) + 1);
        }
        System.out.println(wordsCount);
    }
}
