package BasicJavaDay3;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i,no,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime :");
        no=sc.nextInt();
        for(i=2;i<=no-1;i++)
        {
            if(no%i==0){
                temp=temp+1;
            }
        }
    if(temp==0)
    {
        System.out.println(no+" Number is prime number");
    }
    else
    {
        System.out.println(no+" Number is not prime number");
    }
    }

}
