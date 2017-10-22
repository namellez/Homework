package homework.tasks.first;

import java.util.Scanner;

public class Task02_06 {

    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number: ");
        a = sc.nextDouble();

        System.out.println("input second number: ");
        b = sc.nextDouble();

        System.out.println("input third number: ");
        c = sc.nextDouble();

        System.out.println("input fourth number: ");
        d = sc.nextDouble();

        double first = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - Math.pow(a, 3.0)*c +b;
        double second = (a*b)/(c*d) - (a*b-c)/(c*d);

        System.out.println("");
        System.out.println("The first result is " + first);
        System.out.println("The second result is " + second);


    }

}
