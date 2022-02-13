import java.io.*;

public class Buffered_Vowel {

	   public static void main(String args[]) throws Exception{
		      System.out.println("Enter a character :");
		      InputStreamReader u = new InputStreamReader(System.in);
		      BufferedReader s= new BufferedReader(u);
		      String ue = s.readLine();
		      
		      
		      char ch = ue.charAt(0);
		      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
		         System.out.println("Given character is an vowel");
		      }else{
		         System.out.println("Given character is a consonant");
		      }
		   }
		}


