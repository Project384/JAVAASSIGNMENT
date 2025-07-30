// Create a program showing the use of inheritance and polymorphism.
public class code2 {
    public static void main(String[] args) {
         Animal[] code2Animals={ new Dog(), new Cat(), new Animal() };
        for (Animal animal : code2Animals) {
            animal.speak();
        }
    }
}

class Animal {
    public void speak() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("The cat meows.");
    }
}
