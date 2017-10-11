package homework.tasks.first;

import java.util.Scanner;

public class Task02_07 {

    public static void main(String[] args) {

        double a = 0;
        double result = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {

        System.out.println("input number: ");
        a = sc.nextDouble();
        if (a >= 0) {
            result = Math.pow(a, 2);
        } else {
            result = Math.pow(a, 4);
        }

        System.out.println("");
        System.out.println("number: " + a);
        System.out.println("result: " + result);
        System.out.println("");

        }
    }

}


/*

    Даны три действительных числа. Возвести в квадрат те из них, значения которых
        неотрицательны, и в четвертую степень — отрицательные.*/
