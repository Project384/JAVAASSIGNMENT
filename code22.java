// 22.	Write a program to check if a given string or number is a palindrome.
import java.util.Scanner;
public class code22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String input=scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
    }

    public static boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        s=s.toLowerCase(); 

        while (left<right) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
