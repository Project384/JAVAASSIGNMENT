// 40.	Write a program to demonstrate the use of static and non-static methods.
public class code40 {
    int v=10;
    static void s() {
        System.out.println("This is a static method.");
    }
    void n() {
        System.out.println("This is a non-static method.");
        System.out.println("Instance var: " + v);
    }
    
    public static void main(String[] args) {
        code40.s();
        new code40().n();
    }
}
