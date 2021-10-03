import java.io.*;
 
class GFG {
     
    // Function to calculate sum
    // of even numbers at even indices
    static int sum_even_and_even_index(int arr[], int n)
    {
     
        int i = 0, sum = 0;
         
        // calculating sum of even
        // number at even index
        for (i = 0; i < n; i+=2) {
         
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
         
       
        return sum;
    }
 
   
    public static void main (String[] args) {
         
        int arr[] = {5, 6, 12, 1, 18, 8};
        int n = arr.length;
        System.out.println("Sum of even numbers"
                      + " at even indices is " +
             + sum_even_and_even_index(arr, n));
    }
}
 
