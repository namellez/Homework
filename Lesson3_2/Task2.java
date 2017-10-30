package homework.tasks.third;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {

        Group group = new Group();

        Student st1 = new Student(new int[]{3, 5, 2, 3, 4});
        group.students.add(st1);

        Student st2 = new Student(new int[]{5, 5, 5, 5, 5});
        group.students.add(st2);

        Student st3 = new Student(new int[]{2, 2, 2, 2, 2});
        group.students.add(st3);

        Student st4 = new Student(new int[]{4, 4, 5, 3, 4});
        group.students.add(st4);

        System.out.println("Средний балл группы: " + group.getGroupAvg());
        System.out.println("Число двоечников: " + group.getLosersNumber());
        System.out.println("Число отличников: " + group.getWinnersNumber());

    }

}

class Student {
    int[] marks;                    // все оценки
    double avg = 0;                 // средний балл
    boolean isLoser = false;        //Студен двоечник?
    boolean isWinner = false;       //Студен отличник?

    public Student(int[] marks) {   //конструктор, в котом считаем средний балл, и определяем отличник или двоечник
        this.marks = marks;

        int twos = 0;
        int fives = 0;
        double sum=0;
        for (int mark : marks
                ) {
            if (mark == 5) fives++;
            if (mark == 2) twos++;
            sum = sum + mark;
        }
        if (fives == marks.length) isWinner = true;
        if (twos>0) isLoser = true;
        avg = sum/marks.length;

    }
}

class Group {

    ArrayList<Student> students = new ArrayList<>();

    public double getGroupAvg() {
        double sum = 0;
        for (Student st : students
                ) {
            sum = sum + st.avg;
        }
        return sum / students.size();
    }

    public int getWinnersNumber() {
        int count = 0;
        for (Student st : students
                ) {
            if (st.isLoser == true) count++;
        }
        return count;
    }

    public int getLosersNumber() {
        int count = 0;
        for (Student st : students
                ) {
            if (st.isWinner == true) count++;
        }
        return count;
    }
}

/*
Оценки, полученные студентами в сессию, являются атрибутами класса Student. Определить:
        а) средний балл учебной группы (использовать класс Group);
        б) средний балл каждого студента;
        в) число отличников;
        г) количество студентов, имеющих "2".*/
