package homework.tasks.first;

import java.util.Scanner;

public class Task02_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int evenCount = 0;
        int divThreeSum = 0;
        int SmallerThanThreeCount = 0;

        System.out.println("how many numbers should you input? ");
        a = sc.nextInt();

        int [] numbers = new int[a];

        for (int i = 0; i <numbers.length; i++) {
            System.out.println("input your number: ");
            numbers[i]=sc.nextInt();
            if(numbers[i]%2==0){evenCount++;}
            if(numbers[i]%3==0){divThreeSum=divThreeSum+numbers[i];}
            if(Math.abs(numbers[i])<3){SmallerThanThreeCount++;}
        }

        System.out.print("your numbers were: ");
        for (int num: numbers
             ) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("there are " + evenCount + " even numbers");
        System.out.println("the sum of numbers that can be divided by 3 is " + divThreeSum);
        System.out.println("there are " + SmallerThanThreeCount + " numbers that are smaller that |3|");

    }
}


/*
    Программа запрашивает количество чисел, затем вводит целые числа в соответствии
        с указанным количеством. Определяет количество четных, сумму кратных 3-м и
        количество чисел, модуль которых <3*/
