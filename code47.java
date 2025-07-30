// 47.	Write a program to reverse a string without using built-in methods.
public class code47 {
    public static void main(String[] args) {
        String input="HelloWorld";
        char[] chars=input.toCharArray();
        int left=0;
        int right=chars.length-1;
        while (left<right) {
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        
        String reversed=new String(chars);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
