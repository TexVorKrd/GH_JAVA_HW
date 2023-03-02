package Seminar6.hw.hw1;


import java.util.Map;

public class Notebook {
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
        System.out.println(brend);
        System.out.println(color);
        System.out.println(cpu);
        System.out.println(hdd);
        System.out.println(matrixSize);
        System.out.println(weight);
        System.out.println(price);

        return "";
    }
}
