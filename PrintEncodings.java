import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner (System.in);
        String s = scn.next();
        printEncodings(s, "");
        

    }

    public static void printEncodings(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
        }
        else if(str.length()==1){
            char ch=str.charAt(0);
            if(ch=='0'){
                return;
            }
            else{
                int chi= ch-'0';
                char code = (char)('a'-1+chi);
                System.out.println(ans+code);
            }
        }
        else{
            char ch=str.charAt(0);
            String rest = str.substring(1);
           
            if(ch=='0'){
                return;
            }
            else{
                int chi= ch-'0';
                char code =( char)('a'-1+chi);
                printEncodings(rest,ans+code);
            }
            String ch12 = str.substring(0,2);
            String restall = str.substring(2);
            
           
            int chv12 =Integer.parseInt(ch12);
            if(chv12<=26){
                 char code = (char)('a'-1+chv12);
                printEncodings(restall,ans+code);
            }
            
            
            
        }
        
    }

}
