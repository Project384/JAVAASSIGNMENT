// 4.	Write a program to demonstrate method overloading and method overriding.
public class code4 {
    public static void main(String[] args) {
        OverloadOverrideDemo overloadObj=new OverloadOverrideDemo();
        overloadObj.display();
        overloadObj.display("Hello");
        overloadObj.display(123);

        System.out.println();

        Parent p=new Parent();
        p.show();

        Parent c=new Child();
        c.show();
    }
}
class OverloadOverrideDemo {
    void display() {
        System.out.println("Display with no parameters");
    }

    void display(String message) {
        System.out.println("Display with message: " + message);
    }

    void display(int number) {
        System.out.println("Display with number: " + number);
    }
}

class Parent {
    void show() {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class overridden show method");
    }
}