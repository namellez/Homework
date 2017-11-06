public class Task1 {


    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student(12345, 27, "John", "Minsk");

        st1.printInfo();
        System.out.println("---------------");
        st2.printInfo();

        st1.setName("Jack");
        System.out.println(st1.getName());

    }

}

class Student {
    private int id;
    private int age;
    private String name;
    private String address;


    Student() {
        this(0, 0, "", "");
    }

    Student(int id, int age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("id: " + id);
        System.out.println("age: " + age);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
