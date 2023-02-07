package JavaTrickyProblem2;
// Why password should be stored in char array char[] instead of string?
//String is immutable so if u change it the previous password will remain stored in Pool.
//Char is mutable it will change without storing previous one.
public class PasswordStore {
    public static void main(String[] args) {
//2nd reason
        String pwd = "Tushar";
        System.out.println("Password is : "+pwd); // So it will directly print password on logs
        // OP : Password is : Tushar  --> This is visible on console
        char[] ch = new char[]{'T','U','S','H','A','R'};
        System.out.println("Password is : "+ch);
        // OP : Password is : [C@74a14482 --> This is not visible, it will print garbage value on logs
    }
}
