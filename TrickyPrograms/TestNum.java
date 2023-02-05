package JavaTrickyProblems;
//Compare two int numbers (Integer Catching)
public class TestNum {
    public static void main(String[] args) {
        Integer num1 = 100;
        Integer num2 = 100;
        //If we compare between range -128 to 127 it will give us equal
        // Now this result in equal but if we cross this limit then number will not equal
        if (num1 == num2)
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Both are not equal");
        }
    }
}
