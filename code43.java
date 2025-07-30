// 43.	Create a program to show method overriding and the use of super to call the parent class method.
public class code43 {
    public static void main(String[] args) {
        M obj=new M();
        obj.show();
    }
}

class L {
    void show() {
        System.out.println("Parent class method");
    }
}

class M extends L{
    @Override
    void show() {
        super.show();  
        System.out.println("Child class overridden method");
    }
}