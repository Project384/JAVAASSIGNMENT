// 7.	Write a Java program to showcase the use of this and super keywords.
public class code7 {
    public static void main(String[] args) {
        Color[] colors={ new Red(), new Blue(), new Color() };
        for (Color c:colors) {
            c.showShade();
        }
    }
}
class Color {
    void showShade() {
        System.out.println("This is a generic color");
    }
}

class Red extends Color {
    @Override
    void showShade() {
        System.out.println("This is red color");
    }
}

class Blue extends Color {
    @Override
    void showShade() {
        System.out.println("This is blue color");
    }
}
