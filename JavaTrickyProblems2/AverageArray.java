package JavaTrickyProblem2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;

//Calculate average of array using Simple Loop, Java 8
public class AverageArray {
    public static void main(String[] args) {
    int[] num= {0,23,45,53,23,43,7,8,9,10};

    //For Each Loop
    int total = 0;
        for (int e:num) {
            total=total+e;
        }
        System.out.println("Total of array is : "+total);
        System.out.println("Average is : "+(total/num.length));

        //Java8: Stream
        OptionalDouble avg = Arrays.stream(num).average();
        System.out.println(avg);
    }
}
