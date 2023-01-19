package BasicProgDay2;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        int marksObtained,passingMarks;
        passingMarks = 40;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks obtained by you");

        marksObtained = input.nextInt();

        if (marksObtained >= passingMarks)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
//OP :- Enter marks obtained by you
//41
//Passed