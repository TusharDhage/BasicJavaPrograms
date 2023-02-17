package JavaTrickyProblems5;

import java.util.Scanner;

public class PrintPrimeNumberAndCountRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number and end number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int count = 0;

        for (int i=num1;i<=num2;i++)
        {
            int n=i;
            int a=2;
            int temp = 0;
            while (a<=(n/2))
            {
                if ((n%a == 0))
                {
                    temp++;
                    break;
                }
                a++;
            }
            if (temp == 0 && i!=0)
            {
                count++;
            }
        }
        System.out.println("Total prime number is: "+count);


    }
}
