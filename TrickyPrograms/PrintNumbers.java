package JavaTrickyProblems;

import java.util.BitSet;
//Print 1 to 100 without using loop or recursion

public class PrintNumbers {
    public static void main(String[] args) {
        BitSet bs = new BitSet(100);
        bs.set(1,101);
        System.out.println(bs);
    }
   // What is BitSet used for?
   // A bitset is a dataset that stores multiple boolean values but takes lesser memory
    // space as compared to other data sets that can store a sequence of bits like a boolean
    // array or boolean vector. Bitsets stores the binary bits in a form that takes less memory space,
    // it stores them in compressed from
}
