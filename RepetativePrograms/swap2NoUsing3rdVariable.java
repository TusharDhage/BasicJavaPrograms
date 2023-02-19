package RepetativePrograms;

import java.util.Scanner;

public class swap2NoUsing3rdVariable {
    public static void main(String[] args) {
        int x,y,temp;

        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
        // 1st logic using 3rd variable
       /* temp = x;
        x = y;
        y = temp;*/
        // 2nd logic without using 3rd variable
        /*x=x+y;
        y=x-y;
        x=x-y;*/
        // 3rd logic without using 3rd variable
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("After Swapping\nx ="+x+"\ny ="+y);
    }
}
//OP:-
// Enter x and y
//11
//22
//Before Swapping
//x = 11
//y = 22
//After Swapping
//x =22
//y =11