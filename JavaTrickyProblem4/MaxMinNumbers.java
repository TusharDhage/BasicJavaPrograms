package JavaTrickyProblem4;

public class MaxMinNumbers {
    public static void main(String[] args) {
        maxNumber(10,20,30);
        minNumber(10,20,30);
    }

    public static void maxNumber(int x,int y,int z)
    {
        int max = 0;
        while (x>0 || y>0 ||z>0)
        {
            x--;
            y--;
            z--;
            max++;
        }
        System.out.println("Max number is : "+max);
    }
    public static void minNumber(int x,int y,int z)
    {
        int min = 0;
        while (x>0 && y>0 && z>0)
        {
            x--;
            y--;
            z--;
            min++;
        }
        System.out.println("Min number is : "+min);
    }
}
