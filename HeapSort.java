public class HeapSort implements SortingStrategy{
 @Override
    public String sort(int[] inputArray) {
        int n = inputArray.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(inputArray, n, i); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>0; i--) 
        { 
           
            int temp = inputArray[0]; 
            inputArray[0] = inputArray[i]; 
            inputArray[i] = temp; 
  
            
            heapify(inputArray, i, 0); 
        } 
     return null;

    } 
  
   
    String heapify(int inputArray[], int n, int i) 
    { 
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2;  
  
        // If left child is larger than root 
        if (l < n && inputArray[l] > inputArray[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && inputArray[r] > inputArray[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = inputArray[i]; 
            inputArray[i] = inputArray[largest]; 
            inputArray[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(inputArray, n, largest); 
        } 
    String list = "";
        for(int k:inputArray){    
            list = list+i+" ";
        }
        return list;
        
    }
}
