// 51.	Implement a program to split a string into words and print each word on a new line.
public class code51 {
    public static void main(String[] args) {
        String input="This is a sample string";

        String[] words=input.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
