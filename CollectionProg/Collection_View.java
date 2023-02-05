package CollectionPackage;

import java.util.HashMap;
//Write a program in java to get the collection view of the values present in a HashMap
public class Collection_View {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String, String>();

        hashMap.put("1","Monday");
        hashMap.put("2","Tuesday");
        hashMap.put("3","Wednesday");
        hashMap.put("4","Thursday");
        hashMap.put("5","Friday");
        hashMap.put("6","Saturday");
        hashMap.put("7","Sunday");

        System.out.println("The original hashmap is :" + hashMap);

        System.out.println("collection view of the values hashmap is :" + hashMap.values());
        System.out.println("collection view of the keys is :" + hashMap.keySet());

    }
}
