// 42.	Write a program to demonstrate multilevel inheritance in Java.
public class code42 {
    public static void main(String[] args) {
        C obj=new C();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}

class A {
    void displayA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Class B method");
    }
}

class C extends B {
    void displayC() {
        System.out.println("Class C method");
    }
}
