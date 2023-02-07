package JavaTrickyProblem2;

public class StringLength {
    public static void main(String[] args) {
        String str = "Tushar";
        System.out.println(str.toCharArray().length);
        System.out.println(str.lastIndexOf(""));
        System.out.println(str.split("").length);
        
        int count = 0;
        for (char c: str.toCharArray()) {
            count++;
        }
        System.out.println("count of string character is : "+count);
    }
}
