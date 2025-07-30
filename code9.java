// 9.	Explain and implement the concept of access modifiers in Java.
public class code9 {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println("Accessing publicVar: " + d.publicVar);
        // System.out.println("Accessing privateVar: " + d.privateVar); // Error
        System.out.println("Accessing protectedVar: " + d.protectedVar);
        System.out.println("Accessing defaultVar: " + d.defaultVar);
        d.showVars();
    }
}
class Demo {
    public int publicVar=1;
    private int privateVar=2;
    protected int protectedVar=3;
    int defaultVar=4;

    public void showVars() {
        System.out.println("publicVar: " + publicVar);
        System.out.println("privateVar: " + privateVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("defaultVar: " + defaultVar);
    }
}