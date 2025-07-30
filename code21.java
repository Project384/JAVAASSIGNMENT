// 21.	Write a program to calculate the factorial of a given number using recursion.
import java.util.Scanner;

public class code21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number=scanner.nextInt();
        scanner.close();

        if (number<0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result=factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }

    public static long factorial(int n) {
        if (n==0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
