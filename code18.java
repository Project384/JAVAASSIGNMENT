// 18.	Write a program to find the largest and smallest numbers in an array.
public class code18 {
    public static void main(String[] args) {
        int[] numbers={ 45, 22, 89, 4, 76, 12, 99, 3 };

        int largest=numbers[0];
        int smallest=numbers[0];

        for (int i=1; i<numbers.length; i++) {
            if (numbers[i]>largest) {
                largest=numbers[i];
            }
            if (numbers[i]<smallest) {
                smallest=numbers[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
