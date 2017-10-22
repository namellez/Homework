package homework.tasks.first;

import java.util.Scanner;

public class Task02_08 {

    public static void main(String[] args) {

        double a;
        double b;
        double h;

        System.out.println("enter a: ");
        Scanner sc = new Scanner (System.in);
        a = sc.nextDouble();

        System.out.println("enter b: ");
        b = sc.nextDouble();

        System.out.println("enter h: ");
        h = sc.nextDouble();

        for (double i = a; i <=b ; i=i+h) {
            if (a==0) {
                System.out.println("x = 0.0 y = division by zero error");
            }else {
                System.out.println("x = " + a + " y = " + 2 * Math.tan(a / 2) + 1);
            }
            a = a + h;
        }
    }

}
