// 45.	Write a program to demonstrate final classes and methods.
final class Puma {
    final void display() {
        System.out.println("This is a final method in a final class Puma.");
    }
}

public class code45 {
    public static void main(String[] args) {
        Puma p=new Puma();
        p.display();
    }
}
