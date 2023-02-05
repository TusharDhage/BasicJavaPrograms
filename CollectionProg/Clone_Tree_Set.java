package CollectionPackage;

import java.util.TreeSet;
//Write a program in Java to clone a Treeset to another Treeset.
public class Clone_Tree_Set {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();

        tree_set.add("Monday");
        tree_set.add("Tuesday");
        tree_set.add("Wednesday");
        tree_set.add("Thursday");
        tree_set.add("Friday");
        tree_set.add("Saturday");
        tree_set.add("Sunday");

        System.out.println("Original Tree set is :" + tree_set);
        //cloning the tree set
        TreeSet<String> clonedTress_set = (TreeSet<String>)tree_set.clone();

        System.out.println("Cloned Tree Set is :" + clonedTress_set);
    }
}
