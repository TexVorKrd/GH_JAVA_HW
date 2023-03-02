package Seminar6.hw.hw1;

import lombok.Data;

import java.util.Map;

/**
 * Класс ноутбуков, строго из типизированых компонентов
 */
@Data
public class Notebook {
    public Component getBrend() {
        return brend;
    }

    public static Notebook randomCreate(){
        return new Notebook();
    }
    private Component hdd;
    private Component brend;
    private Component color;
    private Component price;
    private Component cpu;
    private Component matrixSize;
    private Component weight;

    private  Notebook() {
        randomGenerate();
    }

    /**
     * Создание ноутбука возможно только случайной генерацией
     */
    private void randomGenerate() {

        Map<String, String> myHDD = DateForRNDCreate.rndHdd();
        this.hdd = Component.createHDD(myHDD.get("brend"), myHDD.get("type"), Integer.parseInt(myHDD.get("size")));

        this.color = Component.createColor(DateForRNDCreate.rndColor());

        this.brend = Component.createBrend(DateForRNDCreate.rndBrend());

        this.price = Component.createPrice((int) (Math.random() * 100000));

        Map<String, String> myCPU = DateForRNDCreate.rndCPU();
        this.cpu = Component.createCPU(myCPU.get("brend"), myCPU.get("name"));

        this.matrixSize = Component.createMatrixSize(DateForRNDCreate.rndMatrix());

        this.weight = Component.createWeight(DateForRNDCreate.rndWeigth());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append(this.brend.getPropety().get("brend"))
                .append(" ")
                .append(this.color.getPropety().get("color"))
                .append(" PRICE= ")
                .append(this.price.getPropety().get("price"))
                .toString();
    }
}
