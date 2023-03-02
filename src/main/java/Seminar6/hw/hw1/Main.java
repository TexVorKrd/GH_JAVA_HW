package Seminar6.hw.hw1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        NoteList noteList = new NoteList();
        for (Notebook nb:noteList.getNotebooks()) {
            System.out.println(nb.toString());
        }
        System.out.println("---".repeat(10));

    noteList.getNotebooks().stream()
            .filter(a->NoteList.filterByBrend("ASUS").test(a.getBrend()))
            .forEach(System.out::println);
    }

}
