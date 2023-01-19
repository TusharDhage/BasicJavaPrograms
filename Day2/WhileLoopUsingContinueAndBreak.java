package BasicProgDay2;

import java.util.Scanner;

public class WhileLoopUsingContinueAndBreak {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input an integer");
            n = input.nextInt();
            if (n != 0) {
                System.out.println("You entered " + n);
                continue;
            }
            else {
                break;
            }
        }

    }
}
//OP:- Input an integer
//55
//You entered 55
//Input an integer
//85
//You entered 85
//Input an integer
//99
//You entered 99
//Input an integer
//0