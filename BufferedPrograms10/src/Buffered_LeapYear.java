

import java.io.*;

public class Buffered_LeapYear {
	
	   public static void main(String[] args)throws Exception {
	      int year;
	      InputStreamReader u = new InputStreamReader(System.in);
	  	  BufferedReader lp = new BufferedReader(u);
	      System.out.println("Enter an Year :: ");
	      
	      year = Integer.parseInt(lp.readLine());

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   }
	}


