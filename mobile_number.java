// Playing with mobile numbers
/*
Given number in form of string, the task is find the valid indian mobile or not

rules :
1. the number should contain the 10 or 11 or 12 digits
2. if it is contains 10 digits, then first digit should be 7 or 8 or 9
3. if it contains 11 digits first digit should be 0
4. if it is 12 digits then first two digits should be 91

our task is take the input if it is satisfy the all above condition return's 1 otherwise 0

*/
import java.util.Scanner;
class Testing{

    static void Mobile_number_validator(char mob[]){
        int array_size = mob.length;

        if (array_size == 10 || array_size == 11 || array_size == 12){
            if (array_size == 10){
                if(mob[0] == '7' || mob[0] == '8' || mob[0] == '9'){
                    System.out.println("Valid Mobile Number");
                }
                else{
                    System.out.println("Invalid Mobile Number");
                }
            }
            else if(array_size == 11){
                if(mob[0] == '0'){
                    System.out.println("Valid Mobile Number");
                }
                else{
                    System.out.println("Invalid Mobile Number");
                }
            }
            else if(array_size == 12){
                if(mob[0] == '9' && mob[1] == '1'){
                    System.out.println("Valid Mobile Number");
                }
                else{
                    System.out.println("Invalid Mobile Number");
                }
            }
        }
        else{
            System.out.println("Invalid Mobile Number");
        }
    }
    public static void main(String[] args) {
        
        // creating the scanner object reading the string input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Mobile Number for Check is Indian Mobile number or not  >> ");
        
        // asking input for mobile number store on string on String data type
        String mobile_number = input.next();

        // System.out.println(mobile_number);
        
        // convert the String mobile number to charecter arrray for checking our conditions
        char c[] = mobile_number.toCharArray();
        
        
        // pass the character array argument to the Mobile_number_validator function
        Mobile_number_validator(c);



        // closing the scanner class
        input.close();

    }
}
