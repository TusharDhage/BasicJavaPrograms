package CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;
//Write a program to shuffle all the elements of a collection in Java.
public class Shuffle_collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");

        Collections.shuffle(list);
        System.out.println("Shuffled list is : "+ list);


    }
}
