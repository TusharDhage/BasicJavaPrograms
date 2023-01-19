package BasicProgDay2;

import java.util.Scanner;

public class checkOddAndEvenNumber {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        x = input.nextInt();
        if (x % 2 == 0)
        {
            System.out.println(x+" is a Even Number");
        }
        else
        {
            System.out.println(x+" is a Odd number");
        }
    }
}
//OP:- Enter number
//99
//99 is a Odd number