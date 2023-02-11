package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
     /*  ** Characteristics of Linked List **
        1.Linked list is a linear data structure.
        2.Linked list nodes are stored randomly in memory and are allocated during run time.
        3.Each node consists of value/data and a pointer/link which is the address of the next node
        in the linked list.
        4.Linked list uses extra memory to store links.
        5.Linked List can grow or shrink at any point of time easily.
        6.No need to know the size of the elements during initialization of the linked list.
        7.First node of the linked list is called as Head
        8.Last node next always points to null.*/

     /*   ** The important points about Java LinkedList are:

        Java LinkedList class can contain duplicate elements.
        Java LinkedList class maintains insertion order.
        Java LinkedList class is non synchronized.
        In Java LinkedList class, manipulation is fast because no shifting needs to occur.
        Java LinkedList class can be used as a list, stack or queue.*/

        LinkedList<String> ll = new LinkedList<String>();
        //add
        ll.add("test");
        ll.add("udemy");
        ll.add("youtube");
        //print content of linkedlist
        System.out.println("Linked List content :"+ll);
        //addFirst element
        ll.addFirst("tushar");
        ll.addLast("channel");
        System.out.println("Linked List content :"+ll);

        //get value
        System.out.println("Get element : "+ll.get(2));
        //set value
        ll.set(1,"Laptop");
        System.out.println("Linked List content :"+ll);

        //remove first and last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Linked List content :"+ll);
        ll.remove(2);
        System.out.println("Linked List content :"+ll);

        //how to print all elements of linkedlist
        //for loop
        System.out.println("***Using For Loop***");
        for (int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
        //for advance loop
        System.out.println("***Using For Each Loop***");
        for (String e:ll)
        {
            System.out.println(e);
        }
        //iterator
        System.out.println("***using iterator***");
        Iterator<String> it = ll.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("***Using while Loop***");
        int num=0;
        while (ll.size()>num)
        {
            System.out.println(ll.get(num));
            num++;
        }
    }
}
