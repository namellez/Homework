package homework.tasks.first;

import java.util.Scanner;

public class Task02_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int rangeCount = 0;
        int divFiveSum = 0;

        System.out.println("how many numbers should you input? ");
        a = sc.nextInt();

        int [] numbers = new int[a];

        for (int i = 0; i <numbers.length; i++) {
            System.out.println("input your number: ");
            numbers[i]=sc.nextInt();
            if(numbers[i]>15 || numbers[i]<2){rangeCount++;}
            if(numbers[i]%5==4){divFiveSum=divFiveSum+numbers[i];}
        }

        System.out.print("your numbers were: ");
        for (int num: numbers
                ) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("there are " + rangeCount + " numbers that are >15 or <2");
        System.out.println("the sum of numbers that can be divided by 5 and have 4 remaining is " + divFiveSum);
    }
}


/*
    Программа запрашивает количество чисел, вводит целые числа в соответствии с
заявленным количеством ,определяет, сколько чисел больше 15 или <2, чему равна
сумма чисел, которые делятся на 5 с остатком 4. Результат вывести на экран.*/
