package JavaTrickyProblem2;

public class VowelCount {
    public static void main(String[] args) {
        String str = "Automation";
        int count = 0;
        for (int x=0;x<str.length();x++)
        {
            if (isVowel(str.charAt(x)))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }


}
