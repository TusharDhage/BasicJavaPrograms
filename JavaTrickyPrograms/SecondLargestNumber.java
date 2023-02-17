package JavaTrickyProblems5;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] a= new int[]{11,23,45,50,22,53,79,73,99};
        System.out.println("Second Largest: "+getSecondLargest(a,9));
    }
    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }
}
