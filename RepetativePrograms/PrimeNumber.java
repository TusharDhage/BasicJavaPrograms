package RepetativePrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime :");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0){
                temp++;
            }
        }
        //number should be divided by only 1 and itself
    if(temp==2)
    {
        System.out.println(num+" Number is prime number");
    }
    else
    {
        System.out.println(num+" Number is not prime number");
    }
    }

}
