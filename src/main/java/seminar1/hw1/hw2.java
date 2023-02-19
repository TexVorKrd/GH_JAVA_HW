package seminar1.hw1;

//2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//        Пример: 1 2 1 2 -1 1 3 1 3 -1 0
//        2 -1 переход - 2 в сумму
//        3 -1 переход 3 в сумму
//        суммарно выведет 5


import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        System.out.println("sum="+sum());
    }

    public static int sum(){
        Scanner scanner = new Scanner(System.in);
        int dig1=scanner.nextInt();
        int dig2=1;
        int sum=0;
        while (dig2!=0){
            dig2=scanner.nextInt();
            if (dig1>0 && dig2<0) {
                sum+=dig1;
            }
            dig1=dig2;
        }
        return sum;
    }
}
