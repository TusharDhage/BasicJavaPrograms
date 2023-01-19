package BasicProgDay2;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        int n,c;

        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check factorial");
        n = input.nextInt();

        for (c=1;c<=n;c++)
        {
           fact= fact.multiply(inc);
           inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);

    }
}
//OP: Enter number to check factorial
//5
//5! = 120