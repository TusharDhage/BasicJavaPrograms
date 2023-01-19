package BasicProgDay2;

import java.util.Scanner;

public class WhileLoopUsingBreak {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input an integer");
            n = input.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println("You entered " + n);
        }
    }
}
//OP: Input an integer
//5
//You entered 5