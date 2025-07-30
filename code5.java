// 5.	Create a class hierarchy for animals that demonstrates polymorphism.
public class code5 {
    public static void main(String[] args) {
        Airplane[] planes={ new Boeing(), new Airbus(), new Embraer() };

        for (Airplane p : planes) {
            p.sound();
            p.fly();
        }
    }
}
abstract class Airplane {
    abstract void sound();
    void fly() {
        System.out.println("Airplane is flying.");
    }
}

class Boeing extends Airplane {
    @Override
    void sound() {
        System.out.println("Boeing makes a roaring sound.");
    }
}

class Airbus extends Airplane {
    @Override
    void sound() {
        System.out.println("Airbus makes a humming sound.");
    }
}

class Embraer extends Airplane {
    @Override
    void sound() {
        System.out.println("Embraer makes a smooth sound.");
    }
}