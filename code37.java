// 37.	Write a program to create a class with multiple constructors (constructor overloading).
public class code37 {
    String name;
    int age;

    code37() {
        name="Unknown";
        age=0;
    }

    code37(String name) {
        this.name=name;
        age=0;
    }

    code37(String name, int age) {
        this.name=name;
        this.age=age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        code37 person1=new code37();
        code37 person2=new code37("yuvaan", 20);
        code37 person3=new code37("yusuf", 19);

        person1.display();
        person2.display();
        person3.display();
    }
}
