package homework.tasks.second;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        String myMonth;

        System.out.println("Enter month: ");
        Scanner sc = new Scanner(System.in);
        myMonth = sc.nextLine().toUpperCase();

        if (myMonth.equals("DECEMBER") || myMonth.equals("JANUARY") || myMonth.equals("FEBRUARY")){
            System.out.println("Its winter!");
        }
        if (myMonth.equals("MARCH") || myMonth.equals("APRIL") || myMonth.equals("MAY")){
            System.out.println("Its spring!");
        }
        if (myMonth.equals("JUNE") || myMonth.equals("JULY") || myMonth.equals("AUGUST")){
            System.out.println("Its summer!");
        }
        if (myMonth.equals("SEPTEMBER") || myMonth.equals("OCTOBER") || myMonth.equals("NOVEMBER")){
            System.out.println("Its winter!");
        }

    }

}
