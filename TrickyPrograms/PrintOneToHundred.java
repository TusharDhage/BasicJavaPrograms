package JavaTrickyProblems;

//Output number should be 1 to 100 without using any number
public class PrintOneToHundred {
    public static void main(String[] args) {
        int one = 'A'/'A';
        String s1 = ".........."; // it will give us length as 10
        //First approach by getting s1 length
        for (int i=one;i<= s1.length()*s1.length();i++)
        {
            System.out.println(i);
        }
        //Second approach by ascii value i.e a=97,b=98, c=99, d=100
        for (int i=one; i<='d';i++)
        {
            System.out.println(i);
        }

    }
}
