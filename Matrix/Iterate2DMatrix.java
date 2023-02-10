package JavaTrickyProblem4.Matric;

import java.util.Arrays;
import java.util.Scanner;

public class Iterate2DMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total rows:");
        int rows= scanner.nextInt();

        System.out.println("Enter total column:");
        int column= scanner.nextInt();

        //2D Array
        int[][] data = new int[rows][column];

        System.out.println("Please enter the matrix data");

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                data[i][j] = scanner.nextInt();
            }
        }
        // 1st Type
        /*for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }*/
        //2nd type
        for (int[] r: data)
        {
            System.out.println(Arrays.toString(r));
        }


    }


}
