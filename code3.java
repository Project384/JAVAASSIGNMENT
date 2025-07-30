// 3.	Explain and implement the concept of abstraction in Java using interfaces.
public class code3 {
    public static void main(String[] args) {
        Shape circle=new Circle(5.0);         
        Shape rectangle=new Rectangle(4.0, 6.0); 
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
interface Shape {
    double calculateArea(); 
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius=radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle implements Shape {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }
    public double calculateArea() {
        return length * width;
    }
}