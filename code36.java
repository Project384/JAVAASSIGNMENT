// 36.	Write a program to demonstrate operator precedence in Java.
public class code36 {
    public static void main(String[] args) {
        int a=10+5*2;
        int b=(10+5)*2;
        int c=100/5+3;
        int d=100/(5+3);
        int e=5+3*2-4/2;
        int f=5+(3*(2-4))/2;

        System.out.println("a=10+5*2=" + a);
        System.out.println("b=(10+5)*2=" + b);
        System.out.println("c=100/5+3=" + c);
        System.out.println("d=100/(5+3)=" + d);
        System.out.println("e=5+3*2-4/2=" + e);
        System.out.println("f=5+(3*(2-4))/2=" + f);
    }
}
