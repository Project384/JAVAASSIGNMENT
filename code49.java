// 49.	Write a program to demonstrate the immutability of the String class.
public class code49 {
    public static void main(String[] args) {
        String original="Hello";
        String modified=original.concat(" World");

        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

        System.out.println("Original String after modification attempt: " + original);

        char[] chars=original.toCharArray();
        chars[0]='J';
        System.out.println("Modified char array: " + new String(chars));
        System.out.println("Original String after char array modified: " + original);
    }
}