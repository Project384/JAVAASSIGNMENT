// 25.	Write a program to find the sum of all elements in an array.
public class code25 {
    public static void main(String[] args) {
        int[] numbers={ 5, 10, 15, 20, 25 };

        int sum=0;
        for (int num : numbers) {
            sum+=num;
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}
