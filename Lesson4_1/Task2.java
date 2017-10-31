public class Task2 {

    public static void main(String[] args) {
        int n = 7;

        int[][] ar = new int[n][n];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = (int)(Math.random()*100);

                System.out.printf("%3d ",ar[i][j]);
            }
            System.out.println();
        }
    }

}


/*
    Создайте массив массивов с одинаковым количеством элментов в каждой строке.
        Отсортируйте элементы этого массива ‘по столбикам’.*/
