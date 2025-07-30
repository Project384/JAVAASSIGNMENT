// 38.	Implement a program to demonstrate the use of a copy constructor in Java.
public class code38 {
    String name;
    int age;

    code38(String name, int age) {
        this.name=name;
        this.age=age;
    }

    code38(code38 other) {
        this.name=other.name;
        this.age=other.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        code38 person1=new code38("Yuvaan", 20);
        code38 person2=new code38(person1);

        person1.display();
        person2.display();
    }
}
