// 29.	Write a program to demonstrate a 2D array and print its elements.
public class code29 {
    public static void main(String[] args) {
        int[][] array2D={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i=0; i<array2D.length; i++) {
            for (int j=0; j<array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
