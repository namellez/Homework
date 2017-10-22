package homework.tasks.second;

import java.util.Scanner;

public class Task3 {

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
        SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        String myMonth;
        Month month;

        System.out.println("Enter month: ");
        Scanner sc = new Scanner(System.in);
        myMonth = sc.nextLine().toUpperCase();

        month = Month.valueOf(myMonth);

        switch(month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("Its winter!");
                break;

            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Its spring!");
                break;

            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Its summer!");
                break;

            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Its autumn!");
                break;

            default:
                System.out.println("No such month!");
                break;
        }
    }

}


/*
    Введите номер месяца как строку,
    с помощью valueOf переведите ее в элемент перечисления,
    с помощью оператора switch определите, на какой сезон (зима, весна, осень, лето) попадает этот метод.*/
