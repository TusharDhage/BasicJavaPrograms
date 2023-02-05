package CollectionPackage;

import java.util.ArrayList;
//Write a program in java to join two arraylists into one arraylist.
//We use the addAll() method of the ArrayList class to add the contents
// of both the given arraylists into a new arraylist
public class Join_ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        arrayList.add("Thursday");

        System.out.println("Print first list : "+ arrayList);

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Friday");
        arrayList1.add("Saturday");
        arrayList1.add("Sunday");

        System.out.println("Print second list :" + arrayList1);

        ArrayList<String> joinArrayLists = new ArrayList<String>();
        joinArrayLists.addAll(arrayList);
        joinArrayLists.addAll(arrayList1);

        System.out.println("Joint list : "+ joinArrayLists);
    }
}
