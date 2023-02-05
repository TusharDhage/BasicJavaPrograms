package JavaTrickyProblems;

public class PrintHelloWorld {
    //Print Hello World without using semicolonI(;)
    public static void main(String[] args) {

        //1st Approach
        if (System.out.printf("Hello World" + "\n") == null)
        {

        }
        //2nd Approach
        if (System.out.append("Hello World" + "\n") == null)
        {

        }
        //3rd Approach
        if (System.out.append("Hello World" + "\n").equals(null))
        {

        }
        //4th Apprach
        for (int i=0;i<1;System.out.println("Hello World"))
        {
            i++;
        }

    }
}
