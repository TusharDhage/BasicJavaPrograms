package JavaTrickyProblem2;

import java.util.StringJoiner;

public class StringJoinerConcept {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","{","}");
        joiner.add("TAD").add("MAD").add("SAD");

        System.out.println(joiner.toString());
    }
}
