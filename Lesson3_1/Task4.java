package homework.tasks.third;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        int[]sequence = new int[]{7,1,3,3,5,3,5,7,7,9};
        createArray(sequence);
    }

    public static void createArray(int[] array){

        List<Integer> zr = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i <array.length; i++) {

            if(array[i]%2==0){
                zr.add(array[i]);
                count++;
            }
        }

        if (count==0){
            System.out.println("There are no even numbers in the sequence");
        }else {

            for (Integer in : zr
                    ) {
                System.out.print(in + " ");
            }
        }
    }

}

//Дана последовательность натуральных чисел а1 , а2 ,..., ап.
// Создать массив из четных чисел этой последовательности.
// Если таких чисел нет, то вывести сообщение об этом факте.