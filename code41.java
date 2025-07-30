// 41.	Implement a singleton class in Java.
public class code41 {
    private static code41 instance;
    private code41() {
    }

    public static code41 getInstance() {
        if (instance==null) {
            instance=new code41();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance called.");
    }

    public static void main(String[] args) {
        code41 obj1=code41.getInstance();
        code41 obj2=code41.getInstance();

        obj1.showMessage();

        if (obj1==obj2) {
            System.out.println("Both obj1 and obj2 refer to the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
