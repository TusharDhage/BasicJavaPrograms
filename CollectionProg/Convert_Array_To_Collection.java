package CollectionPackage;

import java.util.Arrays;
import java.util.List;
//Given an array in Java, convert it to a collection.
public class Convert_Array_To_Collection {
    public static void main(String args[])
    {
        //creating a sample array
        String[] sample_array
                = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        int length_array = sample_array.length;
        System.out.println("The input elements are as follows : ");
        for(int i = 0; i < length_array; i ++)
        {
            System.out.print(sample_array[i] + " ");
        }
        System.out.println();// setting the print cursor to the next line

        List converted_list = Arrays.asList(sample_array);// converting the array to a list

        // print converted elements
        System.out.println("The converted list is as follows : "
                + converted_list);
    }
}
    /*We notice that the order of the values is not the same as that of the order
        in which we inserted the key-value pair in the hashtable. This is because
        the elements of a Hashtable are not guaranteed to be in any particular sequence.
        The hashtable's implementation divides values into multiple buckets based on
        their Hashcode and internal implementation, which means that the same values
        may appear in a different order on different machines, runs, or versions of the framework.
        This is because Hashtables are designed to retrieve data by key rather than by order*/