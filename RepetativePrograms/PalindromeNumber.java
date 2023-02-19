package RepetativePrograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        //Get the number to check for palindrome
        int n1=454,sum=0,temp,rem;
        //Hold the number in temporary variable
        temp = n1;
        //Reverse the number
        while (n1>0)
        {
            rem = n1%10;
            sum = (sum*10)+ rem;
            n1=n1/10;
        }
        //Compare the temporary number with reversed number
        if (temp == sum)
        {
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}
