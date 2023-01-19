package BasicProgDay2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n,c;
        System.out.println("Enter number to print its multiplication table");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Multiplication table of "+n+" is :");
        for (c=1;c<=10;c++)
        {
            System.out.println(n+"*"+c+"="+n*c);
        }
    }
}
//OP:- Enter number to print its multiplication table
//9
//Multiplication table of 9 is :
//9*1=9
//9*2=18
//9*3=27
//9*4=36
//9*5=45
//9*6=54
//9*7=63
//9*8=72
//9*9=81
//9*10=90
