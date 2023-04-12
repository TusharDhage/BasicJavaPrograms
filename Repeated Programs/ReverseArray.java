package RemainingPrograms;

public class ReverseArray {
    public static void main(String[] args) {
        char[] s = {'a','b','c','d','e'};

        int right = s.length-1;
        int left = 0;

        while (left<right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;

            // Increment the left by 1 and Decrement the right by 1
            left++;
            right--;
        }
        for (int i=0;i<s.length;i++)
        {
            System.out.println(s[i]+" ");
        }
    }
}
