package Seminar6.hw.hw1;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс фильтров которые могут применяться к классу ноутбуков
 */
public class NbFilters {

    /**
     * Фильтрация по бренду
     * @param brendName - Имя бренда
     * @return
     */
    public static Predicate<Notebook> filterByBrend(String brendName) {
        Predicate<Notebook> filtByBrend= notebook -> {

            if (notebook==null||notebook.getBrend()==null) return false;

            Component brend = notebook.getBrend();

            if (brend.getPropety()==null||brend.getPropety().size()==0||!brend.getPropety().containsKey("brend")) return false;

            return brend.getPropety().get("brend").toLowerCase().equals(brendName.toLowerCase());

        };
        return filtByBrend;
    }

    /**
     * Фильтрация по цвету
     * @param color - цвет фильтра
     * @return
     */
    public static Predicate<Notebook> filterByColor(String color) {
        Predicate<Notebook> filtByColor= notebook -> {

            if (notebook==null||notebook.getColor()==null) return false;

            Component colorNB = notebook.getColor();

            if (colorNB.getPropety()==null||colorNB.getPropety().size()==0||!colorNB.getPropety().containsKey("color")) return false;

            return colorNB.getPropety().get("color").toLowerCase().equals(color.toLowerCase());

        };
        return filtByColor;
    }

    /**
     * Фильтрация по цене меньше определенного значения
     * @param price - максимальная цена
     * @return
     */
    public static Predicate<Notebook> filterByPriceLess(Integer price) {
        Predicate<Notebook> filtByPrice= notebook -> {

            if (notebook==null||notebook.getPrice()==null) return false;

            Component priceNB = notebook.getPrice();

            if (priceNB.getPropety()==null||priceNB.getPropety().size()==0||!priceNB.getPropety().containsKey("price")) return false;

            return Integer.parseInt(priceNB.getPropety().get("price"))< price;

        };
        return filtByPrice;
    }

    /**
     * Список фильтров для применения. Predicate
     */
    private List<Predicate<Notebook>> filterList;

    public NbFilters() {
        this.filterList = new LinkedList<>();;
    }

    /**
     * Добавление фильтра в список
     * @param filter
     */
    public void add(Predicate<Notebook> filter){
        filterList.add(filter);
    }

    /**
     * Применение списка фильтров к списку ноутбуков.
     * @param nbList
     * @return
     */
    public List<Notebook> useFilter(List<Notebook> nbList){
        Stream<Notebook> strm=nbList.stream();
        for (Predicate<Notebook> filter:this.filterList) {
            strm=filtredStrem(strm,filter);
        }
        return strm.collect(Collectors.toList());
    }

    Stream<Notebook> filtredStrem(Stream<Notebook> stream, Predicate<Notebook> filter){
        return stream.filter(filter);
    }


}
