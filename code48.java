// 48.	Implement a program to count the frequency of characters in a string.
public class code48 {
    public static void main(String[] args) {
        String input="hello world";
        int[] freq=new int[256]; 

        for (int i=0; i<input.length(); i++) {
            char ch=input.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i=0; i<freq.length; i++) {
            if (freq[i]>0) {
                System.out.println("'" + (char) i + "' : " + freq[i]);
            }
        }
    }
}
