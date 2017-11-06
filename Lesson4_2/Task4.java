import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task4 {

    public static void main(String[] args) {

        Comission com = new Comission();

        Abiturient ab1 = new Abiturient("John", 8);
        com.paidGroup.add(ab1);

        Abiturient ab2 = new Abiturient("Jack", 9);
        com.paidGroup.add(ab2);

        Abiturient ab3 = new Abiturient("Jim", 7);
        com.paidGroup.add(ab3);

        Abiturient ab4 = new Abiturient("Jake", 1);
        com.paidGroup.add(ab4);

        Abiturient ab5 = new Abiturient("Jane", 4);
        com.paidGroup.add(ab5);

        com.setAvailablePlaces(3);
        com.generateStudentsList();

    }

}

class Abiturient{
    String name;
    int mark;

Abiturient(String name, int mark){
    this.name = name;
    this.mark = mark;
    }

}

class Comission{                    //этот класс работает с абитуриентами и сортирует их по группам
    int availablePlaces;                                        // количество свободных мест
    ArrayList<Abiturient> paidGroup = new ArrayList();          // в эту группу изначально попадают все студенты, а потом из нее извлекаем бюджетников
    ArrayList<Abiturient> freeGroup = new ArrayList();          // в эту группу попадают бюджетники (с самыми высокими баллами)


    public void setAvailablePlaces(int availablePlaces) {
        this.availablePlaces = availablePlaces;
    }

    public void generateStudentsList(){                         //

        Collections.sort(paidGroup, Collections.reverseOrder(new MarkComparator()));    //сортируем массив всех студентов по убыванию баллов

        for (int i = 0; i <availablePlaces ; i++) {                                     //извлекаем бюджетников в их группу
            freeGroup.add(paidGroup.get(i));
        }

        for (int i = 0; i <availablePlaces ; i++) {                                     //удаляем бюджетников из общей группы
            paidGroup.remove(0);
        }


        System.out.println("Students in free group");                                   //печатаем списки обеих групп
        for (Abiturient ab:freeGroup
                ) {
            System.out.println(ab.name + " " + ab.mark);
        }

        System.out.println();

        System.out.println("Students in paid group");
        for (Abiturient ab:paidGroup
                ) {
            System.out.println(ab.name + " " + ab.mark);
        }

    }

}

class MarkComparator implements Comparator {        //компаратор, чтоб отсортировать массив студентов по оценкам
    public int compare(Object o1,Object o2){
        Abiturient a1=(Abiturient)o1;
        Abiturient a2=(Abiturient)o2;

        if(a1.mark==a2.mark)
            return 0;
        else if(a1.mark>a2.mark)
            return 1;
        else
            return -1;
    }
}



/*
    Имеется список абитуриентов (класс Abiturient) и список оценок, полученных ими на вступительных экзаменах.
        Напечатать список поступивших, если число мест меньше числа абитуриентов.*/
