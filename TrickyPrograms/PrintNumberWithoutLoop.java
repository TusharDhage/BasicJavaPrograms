package JavaTrickyProblems;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {
//Print 1 to 100 without using loop
    // 1. Recursive function --> 2 usages
    // 2. Java Stream
    public static void main(String[] args) {
        // printNumber(1);
       // printNumber(1,100);
        IntStream.range(1,101).forEach(value -> System.out.println(value));
    }

    public static void printNumber(int x)
    {
        if (x <= 100)
        {
            System.out.println(x);
            x++;
            printNumber(x);
        }
    }
    //or second type
    public static void printNumber(int x,int y)
    {
        if (x <= y)
        {
            System.out.println(x);
            x++;
            printNumber(x,y);
        }
    }

}
