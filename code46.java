// 46.	Create a program to show run-time polymorphism using dynamic method dispatch.
public class code46 {
    public static void main(String[] args) {
        Shoe s;

        s=new Reebok();
        s.brand();

        s=new UnderArmour();
        s.brand();
    }
}
class Shoe {
    void brand() {
        System.out.println("Generic Shoe brand.");
    }
}

class Reebok extends Shoe {
    @Override
    void brand() {
        System.out.println("Reebok brand shoe.");
    }
}

class UnderArmour extends Shoe {
    @Override
    void brand() {
        System.out.println("UnderArmour brand shoe.");
    }
}