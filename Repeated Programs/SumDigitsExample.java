package RemainingPrograms;

public class SumDigitsExample {
    public static void main(String[] args) {
        System.out.println(getSumOfAllDigit(1234));
    }
   public static int getSumOfAllDigit(int num)
   {
       // Declare variable sum which will store the sum of all digits.
       int sum=0;

       // Run a while loop until the num becomes 0.
       while(num != 0)
       {
           int rem = num%10;
           sum = sum+rem;
           num = num/10;
       }
       return sum;
   }
}
