package Seminar6.hw.hw1;

public class Main {
    public static void main(String[] args) {
        demo();
    }

    /**
     * Демо работы фильтрации
     */
    public static void demo() {

        NbFilters filters = new NbFilters();
        NoteList noteList = new NoteList();
        noteList.sout();

        filters.add(NbFilters.filterByBrend("Aser"));
        filters.add(NbFilters.filterByColor("RED"));
        filters.add(NbFilters.filterByPriceLess(70000));

        System.out.println("-".repeat(30));

        NoteList newList=new NoteList(filters.useFilter(noteList.getNotebooks()));
        newList.sout();

    }

}
