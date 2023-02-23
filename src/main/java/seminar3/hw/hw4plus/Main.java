package seminar3.hw.hw4plus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> test = new LinkedList<Integer>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);



        System.out.println(test.toString());
        ArrayList<LinkedList<Integer>> tester =difMix(test);
        for (LinkedList<Integer> linkedList:tester) {
            System.out.println(linkedList.toString());

        }

    }

    public static ArrayList<LinkedList<Integer>> difMix(LinkedList<Integer> array) {

        ArrayList<LinkedList<Integer>> resaultArray = new ArrayList<>();

        if (array.size() == 1) {
            resaultArray.add(array);
            return (resaultArray);
        }

        for (int i = 0; i < array.size(); i++) {

            Integer tmp = array.get(0);
            array.set(0, array.get(i));
            array.set(i, tmp);

            ArrayList<LinkedList<Integer>> tempArray = difMix(listToLinkedList(array.subList(1, array.size())));
            for (int j = 0; j < tempArray.size(); j++) {
                tempArray.get(j).addFirst(array.get(0));
                resaultArray.add(tempArray.get(j));
            }
        }
        return resaultArray;
    }

    public static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer item : list) {
            linkedList.add(item);
        }
        return linkedList;
    }

}
