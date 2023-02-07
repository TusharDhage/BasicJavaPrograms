package JavaTrickyProblem2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//How to Print count of duplicate characters from String?
public class DuplicateCharacters {
    public static void main(String[] args) {
        PrintDuplicateCharacters("Wakanda");
        PrintDuplicateCharacters("Java");
        PrintDuplicateCharacters(null);
        PrintDuplicateCharacters("");
        PrintDuplicateCharacters("eeew");
    }
    public static void PrintDuplicateCharacters(String str)
    {
        if (str == null)
        {
            System.out.println("String is null");
            return;
        }
        if (str.isEmpty())
        {
            System.out.println("String is empty");
            return;
        }
        if (str.length() == 1)
        {
            System.out.println("Single Char String");
            return;
        }

        char words[]=str.toCharArray();
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();

        for (Character ch: words)
        {
            if (charMap.containsKey(ch))
            {
                charMap.put(ch,charMap.get(ch)+1);
            }
            else {
                charMap.put(ch,1);
            }
        }
        //print the value
        Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character,Integer> entry : entrySet)
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + ":" + entry.getValue());

            }
        }
    }
}
