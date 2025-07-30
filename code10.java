// 10.	Show an example of the final keyword for variables, methods, and classes.
public class code10 {
    public static void main(String[] args) {
        FinalClass obj=new FinalClass();
        obj.finalMethod();
        obj.normalMethod();
    }
}
final class FinalClass {
    final int finalVariable=10;

    final void finalMethod() {
        System.out.println("This is a final method.");
    }

    void normalMethod() {
        System.out.println("This is a normal method.");
    }
}

