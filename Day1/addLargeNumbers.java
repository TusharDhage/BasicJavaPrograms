package BasicProgramDay1;

import java.math.BigInteger;
import java.util.Scanner;

public class addLargeNumbers {
    public static void main(String[] args) {
        String number1, number2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first large number");
        number1 = in.nextLine();

        System.out.println("Enter second large number");
        number2 = in.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;
        sum = first.add(second);

        System.out.println("Sum of two large number is : "+ sum );
    }
}
//OP: Enter first large number
//123654789321654789
//Enter second large number
//12365478951753258654
//Sum of two large number is : 12489133741074913443
