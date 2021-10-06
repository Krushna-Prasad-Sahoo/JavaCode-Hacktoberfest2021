import java.util.*;
class TernaryOperation
  {
  public static void main(String s[])
    {
    int a;
    String b;
    System.out.println("Enter your age:");
    Scanner sc=new Scanner (System.in);
    a=sc.nextInt();
    b=(a > 18) ? "can" : "cannot"
    System.out.println("you "+b+" vote.");
    sc.close();
    }
  }
    
