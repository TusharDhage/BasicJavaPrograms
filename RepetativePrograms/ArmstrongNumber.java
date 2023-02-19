package RepetativePrograms;

public class ArmstrongNumber {
   /* An Armstrong number of three digits is an integer such that the sum of the cubes of
    its digits is equal to the number itself.
    For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.*/
    public static void main(String[] args)
    {

        int n = 153;
        int temp = n;
        int p = 0;

        /*function to calculate
          the sum of individual digits
         */
        while (n > 0) {

            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }

        /* condition to check whether
           the value of P equals
           to user input or not. */
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                    "No. It is not an Armstrong No.");
        }
    }
}
