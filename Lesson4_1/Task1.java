public class Task1 {

    public static void main(String[] args) {

        int n = 5;          //размерность массива
        int a = 1;          //первый член
        int b = 2;          //второй член
        int count = 0;      //счетчик

        int[] ar1 = new int[n * n];
        ar1[0] = a;
        ar1[1] = b;
        for (int i = 2; i < ar1.length; i++) {
            ar1[i] = ar1[i - 2] + ar1[i - 1];
        }

        int[][] ar2 = new int[n][n];

        for (int i = 0; i < ar2.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                ar2[i][j] = ar1[count];
                count++;
                System.out.print(ar2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
    Инициализировать массив массивов таким образом, чтобы следующим элемент
        массива был равер сумме двух предыдущих*/
