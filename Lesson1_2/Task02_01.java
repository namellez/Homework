package homework.tasks.first;

import java.util.Scanner;

public class Task02_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("input first number: ");
        a = sc.nextInt();

        System.out.println("input second number: ");
        b = sc.nextInt();

        if (a==b){
            System.out.println("скоро Новый Год!");
        }else{
            System.out.println("input third number: ");
            c = sc.nextInt();
            System.out.println("a+b+c = " + (a+b+c));
            System.out.println("a^2 + b^2 = " + (Math.pow((double)a, 2.0) + Math.pow((double)b, 2.0)));
            System.out.println("моя любимая футбольная команда");
        }

    }


}




   /* Программа вводит два числа a и b, если a=b, то вывести на экран слова «скоро Новый
        Год!», в противном случае ввести третье число с и вывести на экран 3 строки :
        -значение выражения a+b+c
        -значение выражения 𝑎2 + 𝑏2
        -«моя любимая футбольная команда»*/
