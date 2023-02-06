package PatternPrograms;

public class AlphabetPattern {
    public static void main(String[] args) {
        //ASCII value of 'A' is 65 and so on.
        //ASCII value of 'a' is 97 and so on.
        int alpha=65;

        for (int i=0;i<=5;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print((char)(alpha+j));
            }
            System.out.println("");
        }
//=========================================
        for (int i=0;i<=5;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print((char)alpha+" ");
            }
            alpha++;
            System.out.println("");
        }
    }
}
