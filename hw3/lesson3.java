package Lesson3hw;
import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args){
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(zamena01(array01)));
        System.out.println("\ndo 1: ");
        do1(100);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // task 3
        System.out.println("\ndo 3: ");
        do3(arr3); // 3 check
        System.out.println("\ndo 4: ");
        do4(); //  4 check
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //  task 5a
        do5(arr); // Task 5
        System.out.println("\ndo 5: ");

    }
    // Заменить 0 на 1, 1 на 0;
    public static int[] zamena01(int[] array){
        for(int i = 0; i < aarray.length; i++){
            array[i] a= (array[i] == 0)? 1 : 0;
        }
        return array;
    }
    // Заполнить массив значениями 1 2 3 4 5 6 7 8 … 100;
    public static void do1(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
         }
        }
    //Задать массив, пройти по нему циклом, и числа меньшие 6 умножить на 2

    public static void do3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    /*Создать квадратный двумерный целочисленный массив, и с помощью цикла заполнить его диагональные
    элементы единицами (можно только одну из диагоналей, если обе сложно).
    */
    public static void do4() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void do5( int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

