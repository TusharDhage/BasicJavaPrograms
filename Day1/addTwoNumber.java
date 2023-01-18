package BasicProgramDay1;

import java.util.Scanner;

public class addTwoNumber {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter two number to calculate their sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of two numbers is : " + z);
    }
}
