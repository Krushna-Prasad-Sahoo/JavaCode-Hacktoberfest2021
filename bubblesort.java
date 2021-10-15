public class BubbleSort implements SortingStrategy {

    @Override
    public String sort(int[] inputArray) {
        int n = inputArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (inputArray[j - 1] > inputArray[j]) {  
                    temp = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = temp;
                }

            }
        }
        String list = "";
        for(int i:inputArray){    
            list = list+i+" ";
        }
        return list;
    }
}
