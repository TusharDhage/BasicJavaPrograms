package JavaTrickyProblem4;
//Print your name 1000 times without using any loop in Java
public class PrintNames {
    public static void main(String[] args) {
        String name = "Tushar";
        String s = "i";

        s = s.replaceAll("i","iiiiiiiiii");//10
        s = s.replaceAll("i","iiiiiiiiii");//10*10=100
        s = s.replaceAll("i","iiiiiiiiii");//100*10=1000

        s = s.replaceAll("i",name+"\n");
        System.out.println(s);
    }
}
