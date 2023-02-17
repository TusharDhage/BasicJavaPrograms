package JavaTrickyProblems5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        /*You can use the distinct() method from the Stream API.
        The distinct() method return a new Stream without duplicates
        elements based on the result returned by equals() method,
        which can be used for further processing. The actual processing
        of Stream pipeline starts only after calling terminal methods like forEach() or collect().

                Approach:

        Get the ArrayList with duplicate values.
        Create a new List from this ArrayList.
        Using Stream().distinct() method which return distinct object stream.
        convert this object stream into List*/

        // input list with duplicates
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,67,899,54,1,3,4,0));
        System.out.println("ArrayList with duplicates: " + list);

        // Construct a new list from the set constructed from elements
        // of the original list
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);

    }
}
