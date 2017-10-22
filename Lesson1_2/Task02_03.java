package homework.tasks.first;
import java.util.Scanner;

public class Task02_03 {

    public static void main(String[] args) {
        int a;
        double b;
        int count=0;

        System.out.println("How many numbers should you input? ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for (int i = 0; i <a ; i++) {
            System.out.println("Input a number: ");
            b = sc.nextDouble();
            if((int)b%2==0 && (int)b>15) count++;
        }
        System.out.println("There are " + count + " even numbers >15");

    }
}


/*
    Программа вводит количество чисел N, а затем N вещественных чисел. Программа
        усекает вещественные числа и определяет, сколько среди усеченных чисел четных
        и >15.*/
