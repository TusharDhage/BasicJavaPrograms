package JavaTrickyProblems;
//will static block executed with final variable
public class TestStaticBlock {
    public static void main(String[] args) {
        System.out.println(main.x);
    }
}
//it will take x as final inside the byte code if we remove final then static block will run
class main{
    public static final int x =100;

    static {
        System.out.println("main  -- class  static block");
    }
}
