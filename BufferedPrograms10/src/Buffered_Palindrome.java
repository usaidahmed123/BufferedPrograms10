import java.io.*;
public class Buffered_Palindrome {

       public static void main(String args[]) throws Exception 
       {  
          String original, reverse = ""; // Objects of String class  
          InputStreamReader u = new InputStreamReader(System.in);
      	  BufferedReader pr = new BufferedReader(u);
      	  System.out.println("Enter a string/number to check if it is a palindrome");  
      	  
          original = pr.readLine();   
          int length = original.length();   
          for ( int i = length - 1; i >= 0; i-- )  
             reverse = reverse + original.charAt(i);  
          if (original.equals(reverse))  
             System.out.println("The string number is a palindrome.");  
          else  
             System.out.println("The entered string number is no way a palindrome.");   
       }  
    }  


