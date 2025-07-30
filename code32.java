// 32.	Write a program to demonstrate the use of arithmetic, relational, and logical operators.
public class code32 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int sum=a+b;
        int diff=b-a;
        int product=a*b;
        int quotient=b/a;
        int remainder=b%a;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("\nRelational Operators:");
        System.out.println("a==b: " + (a==b));
        System.out.println("a!=b: " + (a!=b));
        System.out.println("a>b: " + (a>b));
        System.out.println("a<b: " + (a<b));
        System.out.println("a>=b: " + (a>=b));
        System.out.println("a<=b: " + (a<=b));

        boolean x=true;
        boolean y=false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}
