package JavaTrickyProblems5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        //defining an array of integer type
        int[] arr = new int[]{22,15,67,-4,-77,99};
        //invoking sort() method of the Arrays class
        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order: ");
        //prints array using the for loop
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
