package JavaTrickyProblem4;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;

        //This is reverse number code
       /* while (num > 0)
        {
            int rev = num%10;
            System.out.print(rev);
            num = num/10;

        }*/
        rev(1234);
    }
    //this is reverse num using recursion
    public static void rev(int num)
    {
        if(num<10)
        {
            System.out.print(num);
            return;
        }
        else
        {
            System.out.print(num%10);
            rev(num/10);
        }
    }
}
