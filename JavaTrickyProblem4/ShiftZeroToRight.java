package JavaTrickyProblem4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftZeroToRight {
     public static void main(String[] args)
    {
        int[] i = new int[]{1,0,9,0,3,4};
        System.out.println(Arrays.toString(shiftZeroToRight(i)));
    }

    public static int[] shiftZeroToRight(int a[])
    {
        if (a.length == 1)
        {
            return a;
        }
        int newArray[] = new int[a.length];
        int count = 0;
        for (int number : a)
        {
            if (number != 0)
            {
                newArray[count] = number;
                count++;
            }
        }
        return newArray;
    }
}
