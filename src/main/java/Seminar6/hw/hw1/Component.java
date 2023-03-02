package Seminar6.hw.hw1;


import lombok.Data;

import java.util.Map;
import java.util.stream.Collectors;




public class Component implements Comparable<Component> {
    public String getName() {
        return name;
    }

    public String getTarnslate() {
        return tarnslate;
    }

    public Map<String, String> getPropety() {
        return propety;
    }

    private String name;
    private String tarnslate;
    private Map<String,String> propety;

    private Component(String name, String tarnslate, Map<String, String> propety) {
        this.name = name;
        this.tarnslate = tarnslate;
        this.propety = propety;
    }

    public static Component createHDD(String brend, String type, Integer value) {
        return new Component("HDD", "Жесткий диск", Map.of("brend", brend, "type", type, "value", Integer.toString(value)));
    }

    public static Component createBrend(String value) {
        return new Component("BREND", "Производитель", Map.of("brend", value));
    }

    public static Component createColor(String color) {
        return new Component("Color", "Цвет", Map.of("color", color));
    }

    public static Component createPrice(Integer value) {
        return new Component("Price", "Цена", Map.of("price", Integer.toString(value)));
    }

    public static Component createCPU(String brend, String name) {
        return new Component("CPU", "Процессор", Map.of("brend", brend,"name",name));
    }

    public static Component createMatrixSize(Double size) {
        return new Component("Size", "Размер экрана", Map.of("size", Double.toString(size)));
    }

    public static Component createWeight(Double weight) {
        return new Component("Weight", "Вес", Map.of("weight", Double.toString(weight)));
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder()
                .append(name)
                .append("(")
                .append(tarnslate)
                .append(")");


        //У компонента нет свойств
        if (propety == null) return stringBuilder.toString();

        //У компонента только одно свойство
        if (propety.size() == 1) return stringBuilder
                .append(" [")
                .append(propety.get(propety.keySet().toArray()[0]))
                .append("]")
                .toString();

        //У компонента много свойств
        stringBuilder
                .append(" [");
        for (String key: propety
                .keySet()
                    .stream()
                        .sorted()
                        .collect(Collectors.toList())){
            stringBuilder
                    .append(key)
                    .append("-( ")
                    .append(propety.get(key))
                    .append(" )/");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1)
                .append("]");

        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Component o) {

        return this.name.compareTo(o.name);
    }
}
