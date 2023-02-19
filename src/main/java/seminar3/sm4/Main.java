package seminar3.sm4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<RandomClass> rndList = new ArrayList<>();

        for (int i = 0; i < (int) (Math.random()*100) ; i++) {
            rndList.add( new RandomClass((int) (Math.random()*10)));
            System.out.println(rndList.get(i).getRnd());
        }

        for (RandomClass element: rndList.stream().distinct().collect(Collectors.toList())
             ) {
        }




    }


}
