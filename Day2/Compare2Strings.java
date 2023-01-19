package BasicProgDay2;

import java.util.Scanner;

public class Compare2Strings {
    public static void main(String[] args) {
        String c1,c2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String c1 here");
        c1= input.nextLine();

        System.out.println("Enter String c1 here");
        c2= input.nextLine();

        if (c1.compareTo(c2) > 0)
        {
            System.out.println("First String is greater than other");
        } else if (c1.compareTo(c2) < 0) {
            System.out.println("Second is greater than first");
        }
        else
        {
            System.out.println("Both String are same");
        }

    }
}
//OP : Enter String c1 here
//Tushar
//Enter String c1 here
//Dhage
//First String is greater than other