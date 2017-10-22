package homework.tasks.third;

public class Task1 {

    public static void main(String[] args) {

        int[] myArray = generateArray(7);
        printArray(myArray);
        findElementSum(3, myArray);
    }

    public static int[] generateArray(int size){

    int[] array = new int[size];
        for (int i = 0; i <array.length; i++) {
            array[i]=(int)(Math.random()*100);
        }
        return array;
    }

    public static void printArray(int[] array){

        for (int in : array
             ) {
            System.out.print(in + " ");
        }
    }

    public static void findElementSum (int k, int[] array){
        int sum = 0;

        for (int i = 0; i <array.length; i++) {

            if (array[i]%k==0){
                sum = sum + array[i];
            }

        }
        System.out.println("");
        System.out.println("The sum of elements is " + sum);

    }

}

    //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К