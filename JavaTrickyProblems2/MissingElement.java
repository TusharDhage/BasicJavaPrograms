package JavaTrickyProblem2;

public class MissingElement {
    public static void main(String[] args) {
        int[] num= {1,2,3,5};
        int n1 = countMissingElement(num,5);
        System.out.println(n1);
    }
 public static int countMissingElement(int num[],int totalCount)
 {
     int expectedCount = totalCount * ((totalCount+1)/2);
     int actualCount = 0;
     for(int i: num)
     {
        actualCount +=i;
     }
     return expectedCount-actualCount;
 }

}
