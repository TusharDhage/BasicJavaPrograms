package JavaTrickyProblem2;

public class StringWordsCount {
    //Count toal Capital words in string
    public static void main(String[] args)
    {
        String str = "TusharAshokDhage";
        int count = 0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                count++;
            }
        }
        System.out.println(count);

        int count1 = 0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                count1++;
            }
        }
        System.out.println(count1);

        long count2=str.chars().filter(value -> value>=65 && value<=90).count();
        System.out.println(count2);
    }
}
