/*Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array,
if there is any Fixed Point present in array, else returns -1.
Fixed Point in an array is an index i such that arr[i] is equal to i.
Note that integers in array can be negative. */

//Solution
// Java program to check fixed point
// in an array using binary search
 
class Main
{
    static int binarySearch(int arr[], int low, int high)
    {
        if(high >= low)
        {  
            /* low + (high - low)/2; */
            int mid = (low + high)/2; 
            if(mid == arr[mid])
                return mid;
            if(mid > arr[mid])
                return binarySearch(arr, (mid + 1), high);
            else
                return binarySearch(arr, low, (mid -1));
        }
       
        /* Return -1 if there is
           no Fixed Point */
        return -1;
    }
       
    //main function
    public static void main(String args[])
    {
        int arr[] = {-10, -1, 0, 3 , 10, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println("Fixed Point is "
                   + binarySearch(arr,0, n-1));       
    }
}
