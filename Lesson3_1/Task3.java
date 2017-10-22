package homework.tasks.third;

public class Task3 {
    public static void main(String[] args) {

        int[]sequence = new int[]{0,1,2,3,4,3,6,7,7,8,8,9};
        analyzeSequence(sequence);
    }

    public static void analyzeSequence (int[] array){

        boolean bl = true;

        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i]>array[i+1]) {
            bl = false;
            }
        }
        System.out.println("Is this sequence rising: " + bl);
    }

}

//Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.