package seminar4.hw.hw1;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> queue = new Stack<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println(queue.toString());
        while (!queue.empty()) {
            System.out.print(queue.pop() + " ");
        }

        LinkedList<Integer> queue1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue1.add(i);
        }
        System.out.println();

        while (!queue1.isEmpty()) {
            System.out.print(queue1.removeLast() + " ");

        }
    }
}
