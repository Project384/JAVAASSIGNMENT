// 23.	Write a program to generate the first n terms of the Fibonacci series.
import java.util.Scanner;

public class code23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n=scanner.nextInt();
        scanner.close();

        int a=0,b=1;
        if (n<=0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("First " + n + " terms of the Fibonacci series:");
            for (int i=1; i<=n; i++) {
                System.out.print(a + " ");
                int next=a+b;
                a=b;
                b=next;
            }
        }
    }
}
