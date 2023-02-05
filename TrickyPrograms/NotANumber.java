package JavaTrickyProblems;

public class NotANumber {
    /*What is NaN - Not a Number?
    “NaN” stands for “not a number”. “Nan” is produced if a floating point operation.
     has some input parameters that cause the operation to produce some undefined result.
     For example, 0.0 divided by 0.0 is arithmetically undefined. Finding out the square
     root of a negative number too is undefined.

    How is NaN defined in diff Lang?*/

    public static void main(String[] args) {
        System.out.println(1.0/0.0); //Infinity
        System.out.println(0.0/0.0); //NaN
        System.out.println(Math.sqrt(-1)); //NaN

        //It is undefined value so while comparing with itself get false as result
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(Float.NaN != Float.NaN);
    }
}
