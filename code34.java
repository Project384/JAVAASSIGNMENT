//34.	Write a program to illustrate the use of the ternary operator.
 public class code34 {
    public static void main(String[] args) {
        int num=10;
        
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);

        int a=15, b=20;
        int max=(a>b)? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is " + max);
    }
}
