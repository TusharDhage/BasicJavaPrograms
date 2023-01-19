package BasicProgDay2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n,reverse=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to print reverse");
        n= input.nextInt();

        while (n!= 0)
        {
            reverse = reverse*10;
            reverse = reverse+n%10;
            n = n/10;
        }
        System.out.println("Reverse of entered number is "+ reverse);
    }
}
//OP:= Enter number to print reverse
//12
//Reverse of entered number is 21