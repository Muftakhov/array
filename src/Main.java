import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        }
        public static void task1() {
        System.out.println("Задача 1.1");
        int[] numbers = new int[3];
            numbers [0] = 1;
            numbers [1] = 2;
            numbers [2] = 3;
        float[] numbers1 = {1,57, 7,654, 9,986 };
            numbers1 [0] = 1.57f;
            numbers1 [1] = 7.654f;
            numbers1 [2] = 9.986f;
        char[] numbers2 = {'q', 'w','e', 'r'};

    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = {1, 2, 3 };
        double[] numbers1 = {1.57, 7.654, 9.986};
        char[] numbers2 = {'q', 'w','e', 'r'};

        for (int i = 0; i < numbers.length; i++){
        System.out.print(numbers[i]);{
            if (i !=numbers.length -1);
                System.out.print (",");
            }
        }
        System.out.println();

        for (int i = 0; i < numbers1.length; i++){
            System.out.print(numbers1[i]);{
                if (i !=numbers1.length -1);
                System.out.print (",");
            }
        }
        System.out.println();

        for (int i = 0; i < numbers2.length; i++){
            System.out.print(numbers2[i]);{
                if (i !=numbers2.length -1);
                System.out.print (",");
            }
        }
        System.out.println();

    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = {1, 2, 3 };
        double[] numbers1 = {1.57, 7.654, 9.986};
        char[] numbers2 = {'q', 'w','e', 'r'};

        for (int i = numbers.length -1 ; i >= 0; i--){
            System.out.print(numbers[i]);{
                if (i !=numbers.length -1);
                System.out.print (", ");
            }
        }
        System.out.println();

        for (int i = numbers1.length -1 ; i >= 0; i--){
            System.out.print(numbers1[i]);{
                if (i !=numbers1.length -1);
                System.out.print (", ");
            }
        }
        System.out.println();

        for (int i = numbers2.length -1 ; i >= 0; i--){
            System.out.print(numbers2[i]);{
                if (i !=numbers2.length -1);
                System.out.print (", ");
            }
        }
        System.out.println();

    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = {1, 3, 5, 7,9};
        for (int i = 0; i < numbers.length; i++)
            if (numbers [i] % 2 != 0){
                numbers [i] =numbers [i] + 1;
                System.out.println(Arrays.toString(numbers));
            }


    }
}
