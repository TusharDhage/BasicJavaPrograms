package JavaTrickyProblem4.Matric;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter total column:");
        int column = scanner.nextInt();

        //2D Array
        int[][] matrix1 = new int[rows][column];
        int[][] transpose = new int[column][rows];

        System.out.println("Please enter the matrix 1 data");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Print input Matrix");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Create transpose Matrix");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                transpose[j][i] = matrix1[i][j];
            }
        }
        System.out.println("Print Transpose matrix");
        for (int[] r : transpose)
        {
            System.out.println(Arrays.toString(r));
        }
    }
}
