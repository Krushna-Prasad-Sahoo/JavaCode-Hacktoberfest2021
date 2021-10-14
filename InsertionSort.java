public class InsertionSort implements SortingStrategy
{

    InsertionSort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  public int[] sort( int[] inputArray )
  {

    for( int i = 1; i < inputArray.length; i++ )
    {
      // a temporary copy of the current element
      int tmp = inputArray[i];
      int j;

      // find the position for insertion
      for( j = i; j > 0; j-- )
      {
        if( inputArray[j - 1] < tmp )
          break;
        // shift the sorted part to right
        inputArray[j] = inputArray[j - 1];
      }

      // insert the current element
      inputArray[j] = tmp;
    }
    System.out.println("Array is sorted using Insertion Sort Algorithm");
    return inputArray;
  }

}
