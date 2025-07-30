// 12.	Write a program to demonstrate the immutability of the String class.
public class code12 {
    public static void main(String[] args) {
        String original="Hello";
        String modified=original.concat(" World");
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);
        original = original.toUpperCase();
        System.out.println("Original String after toUpperCase(): " + original);
    }
}
