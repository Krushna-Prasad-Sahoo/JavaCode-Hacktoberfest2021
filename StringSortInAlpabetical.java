import java.util.Arrays;
import java.util.Scanner;
public class SortingString {
   public static void main(String args[]) {
      int temp, size;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value: ");
      String str = sc.nextLine();
      char charArray[] = str.toCharArray();
      size = charArray.length;
      for(int i = 0; i < size; i++ ) {
         for(int j = i+1; j < size; j++) {
            if(charArray[i]>charArray[j]) {
               temp = charArray[i];
               charArray[i] = charArray[j];
               charArray[j] = (char) temp;
            }
         }
      }
      System.out.println("Third largest element is: "+Arrays.toString(charArray));
   }
}
