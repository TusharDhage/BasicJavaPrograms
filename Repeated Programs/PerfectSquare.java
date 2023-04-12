package RemainingPrograms;

public class PerfectSquare {
    static boolean isPerfectSquare(int x)

    {

        if (x >= 0) {

            int sqrt = (int)Math.sqrt(x);

            return ((sqrt*sqrt) == x);

        }

        return false;

    }

    public static void main(String[] args)

    {

        int x = 8100;

        if (isPerfectSquare(x))

            System.out.print("Given Number is a Perfect Square");

        else

            System.out.print("Given Number is Not a Perfect Square");

    }


}
