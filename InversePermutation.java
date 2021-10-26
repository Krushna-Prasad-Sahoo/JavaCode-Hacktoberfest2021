// Naive java Program to find inverse permutation.
import java.io.*;

class InversePer {

	// java function to find inverse permutations
	static void inversePermutation(int arr[], int size)
	{
		int i ,j;
		// Loop to select Elements one by one
		for ( i = 0; i < size; i++)
		{
		
			// Loop to print position of element
			// where we find an element
			for ( j = 0; j < size; j++)
			{
		
				// checking the element in
				// increasing order
				if (arr[j] == i + 1)
				{
					// print position of element
					// where element is in inverse
					// permutation
					System.out.print( j + 1 + " ");
					break;
				}
			}
		}
	}
	
	// Driver program to test above function
	
	
	public static void main (String[] args)
	{
		int arr[] = {2, 3, 4, 5, 1};
		int size = arr.length;
		inversePermutation(arr, size);
		
	}
}
