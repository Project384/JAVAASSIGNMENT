// 27.	Write a Java program to perform matrix addition and multiplication.
public class code27 {
    public static void main(String[] args) {
        int[][] matrixA={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB={
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] sum=addMatrices(matrixA, matrixB);
        int[][] product=multiplyMatrices(matrixA, matrixB);

        System.out.println("Matrix A + Matrix B:");
        printMatrix(sum);

        System.out.println("\nMatrix A x Matrix B:");
        printMatrix(product);
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows=a.length;
        int cols=a[0].length;
        int[][] result=new int[rows][cols];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA=a.length;
        int colsA=a[0].length;
        int colsB=b[0].length;
        int[][] result=new int[rowsA][colsB];

        for (int i=0; i<rowsA; i++) {
            for (int j=0; j<colsB; j++) {
                result[i][j]=0;
                for (int k=0; k<colsA; k++) {
                    result[i][j]+=a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
