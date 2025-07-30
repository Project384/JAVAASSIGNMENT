// 35.	Implement a program to perform bitwise operations in Java.
public class code35 {
    public static void main(String[] args) {
        int a=60;
        int b=13;
        int result;

        result=a&b;
        System.out.println("a&b= " + result);

        result=a|b;
        System.out.println("a|b= " + result);

        result=a^b;
        System.out.println("a^b= " + result);

        result=~a;
        System.out.println("~a= " + result);

        result=a<<2;
        System.out.println("a<<2= " + result);

        result=a>>2;
        System.out.println("a>>2= " + result);

        result=a>>>2;
        System.out.println("a>>>2= " + result);
    }
}
