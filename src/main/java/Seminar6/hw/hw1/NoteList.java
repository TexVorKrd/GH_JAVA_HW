package Seminar6.hw.hw1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Список Ноутбуков, только автогенерация или списком
 */
@Data
public class NoteList {

    private List<Notebook> notebooks =new ArrayList<>();

    public NoteList() {
        for (int i = 0; i <60 ; i++) {
            notebooks.add(Notebook.randomCreate());
        }
    }

    public NoteList(List<Notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public void sout(){
        for (Notebook nb:this.notebooks) {
            System.out.println(nb.toString());
        }
    }

}
