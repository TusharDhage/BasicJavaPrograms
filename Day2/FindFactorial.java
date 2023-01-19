package BasicProgDay2;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        int n,c,fact=1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number to check factorial");
        n = inp.nextInt();

        if (n<=0)
        {
            System.out.println("number should not be negative");
        }
        else {
            for(c=1;c<=n;c++)
            {
                fact = fact*c;
            }
            System.out.println("Factorial of "+n+" is : "+ fact);
        }
    }
}
//OP: Enter number to check factorial
//5
//Factorial of 5 is : 120