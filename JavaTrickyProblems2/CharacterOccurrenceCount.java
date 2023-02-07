package JavaTrickyProblem2;

import com.sun.deploy.util.StringUtils;

public class CharacterOccurrenceCount {
    public static void main(String[] args) {
        String str = "I am tushar ashok dhage";
        getCharOccurrence(str,'a');
        getCharCount(str,'t');
        getCharCountUsingStreams(str,"s");
        getCharCountUsingStreams(str,"h");
    }

    //1st type
    public static void getCharOccurrence(String str, char value)
    {
        int count = 0;
        for (char ch: str.toCharArray()) {
            if (ch == value)
            {
                count++;
            }
        }
        System.out.println(value+":"+count);
    }
//2nd type
    public static void getCharCount(String str,char value)
    {
        int count = 0;
        for (int i=0;i<str.length();i++)
        {
           if (str.charAt(i)==value)
           {
               count++;
           }
        }
        System.out.println(value+":"+count);
    }
//3rd type
    public static void getCharCountUsingStreams(String str, String value){
        long count =str.chars().mapToObj(e -> String.valueOf((char)e)).filter(e -> e.equals(value)).count();
        System.out.println(value+":"+count);
    }


}
