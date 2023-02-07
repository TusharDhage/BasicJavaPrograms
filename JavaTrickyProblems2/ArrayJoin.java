package JavaTrickyProblem2;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayJoin {
    public static void main(String[] args) {

        String[] batsman = {"Rohit","KL Rahul","Kohli","Gill","Pujara"};
        String[] bowler = {"Siraj","Umesh","Shami","Kuldeep","Ashwin"};

      Stream<String> bat= Arrays.stream(batsman);
      Stream<String> bowl= Arrays.stream(bowler);
      String team[] = Stream.concat(bat,bowl).toArray(size -> new String[size]);
        for (String s: team) {
            System.out.println(s);
            
        }

    }
}
