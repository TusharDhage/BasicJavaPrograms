package JavaTrickyProblems5;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        // using string builder
        /*StringBuilder strb = new StringBuilder(str);

        System.out.println( strb.reverse());*/

        //Using iterator

// Java program to Reverse a String  by
// converting string to characters  one
// by one
        char[] ch = str.toCharArray();
        for (int i= str.length()-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }


    }
}
