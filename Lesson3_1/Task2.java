package homework.tasks.third;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[]{0,4,8,4,6,0,3,0,4,0,5,0,5,};
        generateZerosArray(array);

    }

    public static void generateZerosArray(int[] array){

        List<Integer> zr = new ArrayList<Integer>();

        for (int i =0; i<array.length; i++) {
            if (array[i] ==0){
                zr.add(i);
            }
        }

        for (Integer in: zr
             ) {
            System.out.print(in + " ");
        }
    }
}


   // В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.