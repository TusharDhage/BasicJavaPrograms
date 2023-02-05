package JavaTrickyProblems;
//Pass null argument with method overloading  with string and object types
public class NullArgument {
    public static void main(String[] args) {
    test(null);
    }

    public static void test(Object o)
    {
        System.out.println("Object Argument");
    }
    public static void test(String s1)
    {
        System.out.println("String Argument");
    }
}
