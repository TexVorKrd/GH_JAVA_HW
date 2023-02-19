package seminar3.sm3.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student st1 = new Student("Павлов", 2, 12000, List.of(4, 5, 3, 4));
        Student st2 = new Student("Павлов1", 3, 15000, List.of(4, 5, 3, 4));
        Student st3 = new Student("Павлова", 2, 16000, List.of(4, 5, 3, 4));
        Student st4 = new Student("Павлов3", 3, 17000, List.of(4, 5, 3, 4));
        Student st5 = new Student("Смирнова", 2, 12000, List.of(3, 5, 3, 4));

        List<Student> allStudents = new ArrayList<>();

        allStudents.add(st1);
        allStudents.add(st2);
        allStudents.add(st3);
        allStudents.add(st4);
        allStudents.add(st5);

        for (Student student : allStudents) {
            if (strStudentEnd(student.getFio(), "ова")) {
                int sum = 0;
                for (Integer count : student.getCount()) {
                    sum += count;
                }
                if (sum % 2 == 0) {
                    System.out.println("Степендия = " + student.getMoney());
                }
            }
        }
    }

    public static boolean strStudentEnd(String strName, String findStr) {

        int charCount = strName.length() - findStr.length();
        if (strName.substring(charCount).equals(findStr)) return true;
        return false;
    }
}
