package JavaTrickyProblem2;

public class CharCountUsingStreams {
    public static void main(String[] args) {
        String str = "Good Morning";
        System.out.println(getCharOccurrenceUsingStream(str,'i'));
    }

    public static long getCharOccurrenceUsingStream(String str,char ch) {
        long countChar = str.chars().filter(e -> (char) e == ch).count();
        return countChar;
    }
}

