// 11.	Write a program that uses Java's StringBuilder for efficient string operations.
public class code11 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());
        sb.insert(6, "Java ");
        System.out.println(sb.toString());
        sb.replace(6, 10, "Beautiful ");
        System.out.println(sb.toString());
        sb.delete(6, 16);
        System.out.println(sb.toString());
        System.out.println("Length of StringBuilder content: " + sb.length());
    }
}
