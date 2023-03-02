package Seminar6.hw.hw1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для генерации рандомных ноутбуков, строго типизирован
 */
public class DateForRNDCreate {

    private static final List<String> HDDBRENDLIST = List.of("WD","SEGATE","SAMSUNG");

    private static final List<String> HDDTYPE = List.of("HDD","SSD");

    private static final List<Integer> HDDSIZE = List.of(300,500,1000);

    private static final List<String> BREND = List.of("SONY","LENOVO","ASER","ИМПОРТОЗАМЕЩЕНИЕ","ASUS");

    private static final List<String> COLOR = List.of("RED","GREEN","BLUE","BLACK","SILVER");

    private static final List<String> CPUBREND = List.of("AMD","INTEL");

    private static final Map<String,List<String>> CPUNAME = Map.of("INTEL",List.of("I7","I5","I3"),"AMD",List.of("Ryzen 5","Ryzen 7"));

    private static final List<Double> MATRIX = List.of(17.0,15.0,14.0);

    private static final List<Double> WEIGTH = List.of(1.0,2.0,3.0,4.0,5.0);

    public static Map<String,String> rndHdd(){
        Map<String,String> hdd = new HashMap<>();
        int rnd=(int) (Math.random() * HDDBRENDLIST.size());
        hdd.put("brend", HDDBRENDLIST.get(rnd));
        rnd=(int) (Math.random() * HDDTYPE.size());
        hdd.put("type", HDDTYPE.get(rnd));
        rnd=(int) (Math.random() * HDDSIZE.size());
        hdd.put("size", Integer.toString(HDDSIZE.get(rnd)));
        return hdd;
    }

    public static String rndColor(){
        return COLOR.get((int)(Math.random()*COLOR.size()));
    }
    public static String rndBrend(){
        return BREND.get((int)(Math.random()*BREND.size()));
    }

    public static Map<String, String> rndCPU(){
        Map<String,String> cpu = new HashMap<>();
        int rnd=(int) ((Math.random() * CPUBREND.size()));
        String brend = CPUBREND.get(rnd);
        rnd=(int) ((Math.random() * CPUNAME.get(brend).size()));
        String name = CPUNAME.get(brend).get(rnd);
        cpu.put("brend",brend);
        cpu.put("name",name);
        return cpu;
    }

    public static  Double rndMatrix(){
        return MATRIX.get((int)(MATRIX.size()*Math.random()));
    }

    public static  Double rndWeigth(){
        return WEIGTH.get((int)(WEIGTH.size()*Math.random()));
    }




}
