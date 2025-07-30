// 14.	Implement a program to demonstrate the use of if-else, switch, and for loops.
public class code14 {
    public static void main(String[] args) {
        int number=3;
        if (number>0) {
            System.out.println(number + " is positive");
        } else if (number<0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
        switch (number) {
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
        for (int i=1; i<=5; i++) {
            System.out.println("For loop iteration: " + i);
        }
    }
}
