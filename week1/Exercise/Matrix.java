
import java.util.Scanner;
public class Matrix {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int[][] matrixA, matrixB, matrixC;
        matrixA = new int[2][2];
        matrixB = new int[2][2];
        matrixC = new int[2][2];
        System.out.println("Input value for matrix A");
        for (int i = 0; i < matrixA.length; i++) {
            int row = i + 1;
            for (int j = 0; j < matrixA[i].length; j++) {
                int col = j + 1;
                System.out.print("Enter A" + row + col + ": ");
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input value for matrix B");
        for (int i = 0; i < matrixB.length; i++) {
            int row = i + 1;
            for (int j = 0; j < matrixB[i].length; j++) {
                int col = j + 1;
                System.out.print("Enter B" + row + col + ": ");
                matrixB[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix C = Matrix A + Matrix B\nMatrix C:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
