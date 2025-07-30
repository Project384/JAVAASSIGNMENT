// 15.	Write a program to check if a number is prime using a while loop.
public class code15 {
    public static void main(String[] args) {
        int num=29;
        boolean isPrime=true;
        int i=2;

        if (num<=1) {
            isPrime=false;
        } else {
            while (i<=num/2) {
                if (num%i==0) {
                    isPrime=false;
                    break;
                }
                i++;
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
