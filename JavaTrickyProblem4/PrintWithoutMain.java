package JavaTrickyProblem4;

public class PrintWithoutMain {
    public static void main(String[] args) {

    }
    //1st type
    public static int printString()
    {
        System.out.println("Hello world");
        return 1;
    }
    static int p = printString();

    static {
        System.out.println("hello world from static block");
    }
}
