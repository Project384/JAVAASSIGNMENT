// 50.	Create a program to check if a given string is a palindrome.
public class code50 {
    public static void main(String[] args) {
        String input="madam";
        boolean isPalindrome=true;

        int left=0;
        int right=input.length()-1;

        while (left < right) {
            if (input.charAt(left)!=input.charAt(right)) {
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome)
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is NOT a palindrome.");
    }
}
