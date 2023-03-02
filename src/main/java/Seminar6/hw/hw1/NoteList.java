package Seminar6.hw.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NoteList {
    public List<Notebook> getNotebooks() {
        return notebooks;
    }

    List<Notebook> notebooks =new ArrayList<>();

    public NoteList() {
        for (int i = 0; i <30 ; i++) {
            notebooks.add(Notebook.randomCreate());
        }
    }

    public static Predicate<Component> filterByBrend(String brendNama){
        return component -> component.getPropety().get("brend").toLowerCase().equals(brendNama.toLowerCase());
    }

    public static Predicate<Component> filterByColor(String brendNama){
        return component -> component.getPropety().get("color").toLowerCase().equals(brendNama.toLowerCase());
    }


}
