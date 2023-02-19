package seminar1.sm1;

public class ex3 {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,6,3,2,1};
        System.out.println(tester(myArray));
    }

    public static String tester(int[] array){
//        int[] myArray = {1,2,3,6,3,2,1};
        for (int i = 0; i <array.length/2 ; i++) {
            if (array[i]!=array[array.length-1-i]){
                System.out.println(i);
                return ("Не симметричный");
            }
        }
        return ("Cимметричный");
    }
}
