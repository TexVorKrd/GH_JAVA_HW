package seminar3.hw.hw2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Integer matcherQuality = 1;
        Item item1 = new Item("Товар1", "Россия", 12.5, 10, 1);
        Item item2 = new Item("Товар2", "Беларусия", 11.5, 11, 3);
        Item item3 = new Item("Товар3", "Гандурас", 13.1, 12, 1);
        Item item4 = new Item("Товар4", "ЮАР", 12.7, 10, 2);
        Item item5 = new Item("Товар5", "Россия", 13.5, 5, 1);
        Item item6 = new Item("Товар6", "Россия", 14.5, 5, 2);
        Item item7 = new Item("Товар7", "Россия", 15.5, 5, 1);
        Item item8 = new Item("Товар8", "Россия", 12.6, 100, 2);
        Item item9 = new Item("Товар9", "Россия", 14.5, 100, 1);

        List<Item> items = List.of(item1, item2, item3, item4, item5, item6, item7, item8, item9);
        Integer minPrice = items.stream()
                .filter(a -> a.getItemQality() == matcherQuality)
                .map(a -> a.getPrice())
                .min(Integer::compareTo)
                .orElse(-1);

        if (minPrice != -1) {
            List<String> minPriceListName = items.stream()
                    .filter(a -> a.getPrice() == minPrice)
                    .filter(a -> a.getItemQality() == matcherQuality)
                    .map(a -> a.getName())
                    .collect(Collectors.toList());

            System.out.println("Список товаров категори - " + matcherQuality + " = " + minPriceListName.size());
            for (String name : minPriceListName) {
                System.out.println(name);
            }

        } else {
            System.out.println("Список не корректный");
        }
    }
}
