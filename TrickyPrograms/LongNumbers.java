package JavaTrickyProblems;

//What will be OP when you use Long number with L and without L suffix
public class LongNumbers {
    public static void main(String[] args) {
        long longNumberWithoutL = 1000*60*60*24*365;
        long longNumberWithL = 1000*60*60*24*365L;

        System.out.println(longNumberWithoutL); //1471228928 diff value than calculator
        System.out.println(longNumberWithL); //31536000000 correct calculator value

        /*This is because the number witout L getting out of the range in java
        So it will remove that numbers*/
        //31536000000 - Is 36 bits
        //11101010111101100010010110000000000
        //limit of 32bit int is : 2147483647
        //1010111101100010010110000000000
        //Max limit
        //2147483647 - 1111111111111111111111111111111 Max limit

    }
}
