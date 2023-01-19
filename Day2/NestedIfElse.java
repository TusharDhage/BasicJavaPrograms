package BasicProgDay2;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int marksObtained,passingMarks;
        char grade;

        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your obtained marks");
        marksObtained=input.nextInt();

        if (marksObtained >= passingMarks)
        {
            if (marksObtained>90)
                grade = 'A';

            else if (marksObtained>75)
                grade = 'B';

            else if (marksObtained>60)
                grade = 'C';

            else
                grade = 'D';

            System.out.println("You passed the exam with grade : "+grade);
           }
        else {
            grade = 'F';
            System.out.println("You are failed with grade : "+grade);
        }
        }
    }

//OP: Enter your obtained marks
//97
//You passed the exam with grade : A