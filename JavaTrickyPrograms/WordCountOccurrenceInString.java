package JavaTrickyProblems5;

public class WordCountOccurrenceInString {
    public static void main(String[] args) {
        String str = "This is the test for automation test";
        String word = "test";
        System.out.println(countWordOccurrence(str, word));
    }
    public static int countWordOccurrence(String str, String word) {
        // split the string by spaces in a
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            // if match found increase count
            if (word.equals(a[i])) {
                count++;
            }
        }
        return count;
    }
}
