// 31.	Write a program to remove duplicate elements from an array.
import java.util.Arrays;
import java.util.LinkedHashSet;
public class code31 {
    public static void main(String[] args) {
        int[] numbers={ 4, 5, 4, 2, 2, 7, 8, 5, 9 };

        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int num : numbers) {
            set.add(num);
        }

        int[] uniqueNumbers=new int[set.size()];
        int index=0;
        for (int num : set) {
            uniqueNumbers[index++]=num;
        }

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
    }
}
