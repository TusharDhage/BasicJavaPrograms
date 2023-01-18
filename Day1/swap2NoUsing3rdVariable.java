package BasicProgramDay1;

import java.util.Scanner;

public class swap2NoUsing3rdVariable {
    public static void main(String[] args) {
        int x,y,temp;

        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping\nx = "+x+"\ny = "+y);

        temp = x;
        x = y;
        y = temp;

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