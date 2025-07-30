// 44.	Implement an abstract class and override its methods in a subclass.
public class code44 {
    public static void main(String[] args) {
        Adidas shoe=new Adidas();
        shoe.sound();
        shoe.sleep();
    }
}

abstract class Nike {
    abstract void sound();
    void sleep() {
        System.out.println("Nike is resting.");
    }
}

class Adidas extends Nike {
    @Override
    void sound() {
        System.out.println("Adidas makes its move.");
    }
}