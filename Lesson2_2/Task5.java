package homework.tasks.second;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        String a;
        String b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        b = sc.nextLine();

        System.out.println(a==b);   //== проверяет, ссылаются ли а и b на один объект (нет)
        System.out.println(a.equals(b)); // equals проверяет, имеют ли а и b одинаковое значение


    }


}
