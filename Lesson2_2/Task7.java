package homework.tasks.second;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        int size;
        int max;
        int min;
        int index = 0;
        int temp;

        System.out.println("Input size: ");

        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int[]array = new int[size];

        for (int i = 0; i <size ; i++) {            // initialize array
            array[i] = sc.nextInt();
        }

        max = array[0];
        min = array[0];

        for (int i = 0; i <array.length ; i++) {        // find min and max
            if (array[i]>max) {
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
                index = i;
            }
        }

        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min + " at position №" + index);

        System.out.print("Original array is: ");
        for (int d: array
                ) {
            System.out.print(d + " ");
        }

        for (int i = 0; i <array.length ; i++) {            //sort array
            for (int j = i+1; j <array.length; j++) {
                if (array[j]<array[i]){
                    temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }

        }
        System.out.println("");
        System.out.print("Sorted array is: ");
        for (int d: array
                ) {
            System.out.print(d + " ");
        }

    }
}


    /*  Создайте одномерный массив вещественных чисел.
        Инициализируйте его с клавиатуры.
        Найдите в массиве самое большое число.
        Найдите в массиве самое маленькое число и его индекс.
        Отсортируйте массив методом прямого выбора.

    */