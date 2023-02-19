package seminar3.hw.hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> difMix (List<Integer> array){
        List<Integer> myList= new ArrayList<>();
        List<List<Integer>> tempArray = new ArrayList<>();

        if (array.size()==1){
            myList.add(array.get(0));
            tempArray.add(myList);
            return (tempArray);
        }
        tempArray.add(array);

        for (int i = 1; i <array.size() ; i++) {
            Integer tmp= array.get(0);
            array.set(0,array.get(i));
            array.set(i,tmp);
            List<List<Integer>> tempMixArray=difMix(array.subList(i,i+1));


            for (int j = 0; j <tempMixArray.size() ; j++) {
                System.out.println(i+"--"+j+"--"+tempMixArray.toString());

            }
        }

        return null;
    }

}
