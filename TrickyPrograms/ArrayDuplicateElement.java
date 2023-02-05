package JavaTrickyProblems;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateElement {
    public static void main(String[] args) {
        //1. Brute Force
        //2. HashSet
        String infra[]={"amazon","flipkart","OLX","AWS","amazon","AWS"};

        System.out.println("****brute force****");
        for (int i=0;i<infra.length;i++)
        {
            for (int j=i+1;j< infra.length;j++)
            {
                if (infra[i].equals(infra[j]))
                {
                    System.out.println(infra[i]);
                }
            }
        }

        System.out.println("****HashSet****");
        Set<String> data = new HashSet<String>();
        for (String e : infra){
            if (data.add(e) == false)
            {
                System.out.println(e);
            }
        }
    }
}
