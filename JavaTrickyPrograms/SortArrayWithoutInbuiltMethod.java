package JavaTrickyProblems5;

public class SortArrayWithoutInbuiltMethod {
    public static void main(String[] args) {
        //creating an instance of an array
            int[] arr= new int[]{11,22,33,-22,-11,45,99};
        System.out.println("Array elements after sorting:");
        //sorting logic
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                int temp=0;
                if (arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //prints the sorted element of the array
            System.out.println(arr[i]);
        }
    }
}
