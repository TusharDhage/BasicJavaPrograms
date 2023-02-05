package CollectionPackage;

import java.util.LinkedList;

public class LinkedListClass {
    //Variable Size - list is not in fixed size we can add data without limit
    //Non-Contiguous memory - Data in chunks so we can link each other
    // insert in O(1)
    // search in O(n)
    //Types are : 1. Singular 2. Double 3. Circular

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        /*list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for (int i=0; i< list.size();i++)
        {
            System.out.print(list.get(i) + "-->");
        }
        System.out.println("null");

        list.remove(2);
        System.out.println(list);*/

        // ========================================================================================
        //Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
        // Search for the number 7 & display its index.
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Element to be searched
        int element = 7;

        // Initializing the answer to the index -1
        int answer = -1;

        // Traversing through the Linked List
        for (int i = 0; i < list.size(); i++) {

            // Extracting each element in the Linked List
            int listElement = list.get(i);

            // Checking if the extracted element is equal to
            // the element to be searched
            if (listElement == element) {
                // Assigning the index of the
                // element to answer
                answer = i;
                break;
            }
        }
        // Checking if the element is present in the Linked List
        if (answer == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found in Linked list at :" + answer);
        }

    }

   // Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
}



