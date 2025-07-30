// 13.	Write a program to declare variables of all primitive data types in Java and print their default values.
public class code13 {
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    void printDefaults() {
        System.out.println("byte default: " + defaultByte);
        System.out.println("short default: " + defaultShort);
        System.out.println("int default: " + defaultInt);
        System.out.println("long default: " + defaultLong);
        System.out.println("float default: " + defaultFloat);
        System.out.println("double default: " + defaultDouble);
        System.out.println("char default (Unicode code): " + (int)defaultChar);
        System.out.println("boolean default: " + defaultBoolean);
    }

    public static void main(String[] args) {
        code13 obj=new code13();
        obj.printDefaults();
    }
}
