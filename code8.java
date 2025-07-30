// 8.	Demonstrate the concept of constructors in OOP with a program.
public class code8 {
    public static void main(String[] args) {
        Person p1=new Person("yuvaan", 20);
        Person p2=new Person("dinesh", 19);

        p1.showInfo();
        p2.showInfo();
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
