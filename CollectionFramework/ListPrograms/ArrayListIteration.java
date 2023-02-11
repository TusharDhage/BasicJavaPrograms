package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Naruto");
        tvSeries.add("Demon Slayer");
        tvSeries.add("My Hero Academia");

        System.out.println("*****Using java 8 forEach loop and lambda expression*****");
        //using java 8 forEach loop and lambda expression
        tvSeries.forEach(shows -> {
            System.out.println(shows);
        });

        System.out.println("******Print using Iterator****** ");
        //using iterator
       Iterator<String> it=  tvSeries.iterator();
       while (it.hasNext())
       {
           String shows= it.next();
           System.out.println(shows);
       }
        System.out.println("******Print using Iterator and forEachRemaining()****** ");
        it = tvSeries.iterator();
        it.forEachRemaining(show -> {
            System.out.println(show);
        });

        //Using For Each Loop
        System.out.println("******Print using For Each Loop****** ");
        for (String show: tvSeries) {
            System.out.println(show);
        }

        //using for loop with order/index
        System.out.println("******Print using for loop with order/index****** ");
        for (int i=0;i<tvSeries.size();i++)
        {
            System.out.println(tvSeries.get(i));
        }

        //using listIterator() to traverse in both direction
        System.out.println("******Print using listIterator() to traverse in both direction****** ");
        ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
        while (tvSeriesListIterator.hasPrevious())
        {
            String show = tvSeriesListIterator.previous();
            System.out.println(show);
        }
    }
}
