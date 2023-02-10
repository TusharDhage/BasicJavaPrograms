package JavaTrickyProblem4.Matric;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total rows:");
        int rows= scanner.nextInt();

        System.out.println("Enter total column:");
        int column= scanner.nextInt();

        //2D Array
        int[][] matrix1 = new int[rows][column];
        int[][] matrix2 = new int[rows][column];
        int[][] sum = new int[rows][column];
        System.out.println("Please enter the matrix 1 data");

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Please enter the matrix 2 data");

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("print matrix1 data");
        for (int[] r: matrix1)
        {
            System.out.println(Arrays.toString(r));
        }
        System.out.println("print matrix2 data");
        for (int[] r: matrix2)
        {
            System.out.println(Arrays.toString(r));
        }

        System.out.println("Sum of two matrix");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
