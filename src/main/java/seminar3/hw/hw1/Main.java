package seminar3.hw.hw1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String matcher = "высший";
        Item item1 = new Item("Мука1 высшего сорта", 2000.0, 1);
        Item item2 = new Item("Мука2 высший сорта", 3000.0, 1);
        Item item3 = new Item("Мука3 высший сорта", 5000.0, 3);
        Item item4 = new Item("Мука4 высший сорт", 500.0, 1);
        Item item5 = new Item("Мука5 высший сорт", 6000.0, 2);
        Item item6 = new Item("Мука6 высший сорт", 700.0, 2);
        Item item7 = new Item("Мука7 высшего сорт", 4000.0, 1);

        List<Item> itemList = List.of(item1, item2, item3, item4, item5, item6, item7);
        Double max = itemList.stream()
                .filter(a -> a.getItemQality() == 1 || a.getItemQality() == 2)
                .filter(a -> a.getName().contains(matcher))
                .map(a -> a.getPrice())
                .max((a, b) -> (a < b) ? -1 : ((a == b) ? 0 : 1))
                .orElse(0.0);
        System.out.println("Максимальная цена = " + max);
    }
}
