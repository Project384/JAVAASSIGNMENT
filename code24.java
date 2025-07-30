// 24.	Write a program to check whether a given number is prime.
import java.util.Scanner;
public class code24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num=scanner.nextInt();
        scanner.close();

        if (num<=1) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime=true;
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num%i==0) {
                isPrime=false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
