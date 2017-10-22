package homework.tasks.first;

import java.util.Scanner;

public class Task02_10 {

    public static void main(String[] args) {

    double x = 0;
    double y = 0;

        System.out.println("enter x: ");
        Scanner sc = new Scanner (System.in);
        x = sc.nextDouble();

        if (x<=-3) y=9;
        if (x>3) y= 1/(x*x +1);

        System.out.println("y = " + y);

    }


}
