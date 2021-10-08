public class Exception {
   public static void main(String args[]) {
      try {
         System.out.println("It is try block");
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown :" + e);
      } finally 
      {
         System.out.println("The finally statement is executed");
      }
   }
}
