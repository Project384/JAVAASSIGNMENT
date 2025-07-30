// 30.	Write a program to search for an element in a sorted array using the binary search algorithm.
import java.util.Scanner;
public class code30 {
    public static void main(String[] args) {
        int[] arr={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the element to search for: ");
        int key=scanner.nextInt();
        scanner.close();

        int index=binarySearch(arr, key);

        if (index==-1) {
            System.out.println(key + " is not present in the array.");
        } else {
            System.out.println(key + " is present at index " + index + ".");
        }
    }

    static int binarySearch(int[] arr, int key) {
        int left=0;
        int right=arr.length-1;

        while (left<=right) {
            int mid=left+(right-left)/2;

            if (arr[mid]==key)
                return mid;
            else if (arr[mid]<key)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}
