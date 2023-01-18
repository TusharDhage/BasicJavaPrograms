package BasicProgramDay1;

import java.util.Scanner;

public class ScannerProgram {
    public static void main(String[] args) {
        int a;
        float b;
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String");
        s = in.nextLine();
        System.out.println("You Entered this String :" + s);

        System.out.println("Enter a Float value");
        b = in.nextFloat();
        System.out.println("You Entered this Float value :" + b);

        System.out.println("Enter a Integer");
        a = in.nextInt();
        System.out.println("You Entered this Integer :" + a);

    }
}
//OP :
// Enter a String
//Tushar
//You Entered this String :Tushar
//Enter a Float value
//5.999
//You Entered this Float value :5.999
//Enter a Integer
//22
//You Entered this Integer :22