package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        int a[] = new int[3];//static array -- size is fixed

        //dynamic array  -- ArrayList
   /* 1. can contain duplicate element/value.
    2. maintain insertion order
    3. synchronised
    4. allow random access to fetch the element because it stores the value on the basis of indexes*/
        ArrayList ar = new ArrayList();
        ar.add(20);
        ar.add(30);
        ar.add(10);
        System.out.println("Print arraylist: "+ar);
        System.out.println("Print arraylist size: "+ar.size()); // size of arraylist
        System.out.println("Print arraylist index at 2"+ar.get(2));// to get the value from an index

        //To print all value from arraylist
        //1. for loop
        //2. using iterator

        for (int i=0;i<ar.size();i++)
        {
            System.out.println(ar.get(i));
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //<> -- this is called generic it allows us to type of value we can add
        arrayList.add(20);
        //arrayList.add("Tushar"); -- it will throw error bcaz generic is integer


      //  ArrayList<E> arrayList1 = new ArrayList<E>();
        //Employee class objects
        Employee e1 = new Employee("Tushar",27, "QA");
        Employee e2 = new Employee("Ajinkya",28,"Manual");
        Employee e3 = new Employee("Sanket",25,"API");

        //create arraylist
        ArrayList<Employee> empArr = new ArrayList<Employee>();
        empArr.add(e1);
        empArr.add(e2);
        empArr.add(e3);
        //iterator to traverse the values
        Iterator<Employee> it=empArr.iterator();
        while (it.hasNext())
        {
            Employee emp = it.next();
            System.out.println(emp.name + " " + emp.dept + " "+ emp.age);

        }


        //==================================================================

        System.out.println("******************************************************");
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("test");
        ar1.add("automation");
        ar1.add("Selenium");
        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("test");
        ar2.add("automation");
        ar2.add("Appium");

       // ar1.addAll(ar2); // add all values
       // ar1.removeAll(ar2); // it will remove common value and ar2 value from ar1
        ar1.retainAll(ar2);//it will give common value
        for (int i=0;i<ar1.size();i++)
        {
            System.out.println(ar1.get(i));
        }
    }



}
