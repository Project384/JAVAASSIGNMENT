// 39.	Create a program that initializes class fields using a parameterized constructor.
public class code39 {
    int id;
    String name;

    code39(int id, String name) {
        this.id=id;
        this.name=name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        code39 obj=new code39(101, "Naruto");
        obj.display();
    }
}
