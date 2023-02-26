package seminar5.hw.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String findingWord ="не";

        System.out.println("\""+findingWord + "\" найдено "+wordFinderMap(getData(),findingWord)+" раз");
        System.out.println("\""+findingWord + "\" найдено "+wordFinderStream(getData(),findingWord)+" раз");

    }

    /**
     * Возвращает количество вхождения слова во все строки из списка без учета регистра
     * Через Map Collection.
     *
     * @param strList - List<String> Список Предложений.
     * @param str - String искомое слово.
     * @return - Integer
     */
    public static Integer wordFinderMap(List<String> strList, String str){
        if (strList==null||str==null||str=="") return 0;

        Map<String,Integer> dict = new HashMap<>();



        Integer counter =0;
        for (String line:strList) {
            System.out.println(line);

            for (String word:
                    cleaner(line)
                            .toLowerCase()
                            .replaceAll("\\s+"," ")
                            .split(" ")) {
                dict.put(word,dict.getOrDefault(word,0)+1);
            }
        }
        return dict.getOrDefault(str.toLowerCase(),0);
    }

    /**
     * Возвращает количество вхождения слова во все строки из списка без учета регистра
     * Через Stream.
     *
     * @param strList - List<String> Список Предложений.
     * @param str - String искомое слово.
     * @return - Integer
     */
    public static Long wordFinderStream(List<String> strList,String str){

        if (strList==null||str==null||str=="") return 0L;

        return strList.stream()
                .map(a->cleaner(a))
                .map(a->a.replaceAll("\\s+"," "))
                .map(a->a.split(" "))
                .map(a-> Arrays.stream(a)
                        .filter(b->b.toLowerCase().equals(str.toLowerCase()))
                        .count())
                .mapToLong(a->a)
                .sum();
    }

    /**
     * Считывает данные из файла и возвращает список строк.
     *
     * @return Список строк
     */
    public static List<String> getData(){
        Path path = Path.of("src\\main\\java\\seminar5\\hw\\ex2\\borodino.txt");
        List<String> strings;
        try {
            strings=Files.readAllLines(path);
        } catch (IOException exception) {
            strings=null;
        }
        return strings;

    }


    /**
     * Удаляет знаки препинания из предложений
     * @param str строка из которой нужно удалить символы
     * @return - String строка без знаков препинания.
     */
    public static String cleaner(String str) {

        if (str == null) return null;

        String forDel = ",.:;!?—";

        //Удаляем все символы для удаления
        for (int i = 0; i < forDel.length(); i++) {
            str = str.replace(forDel.substring(i, i + 1), "");
        }
        return str;
    }
}
