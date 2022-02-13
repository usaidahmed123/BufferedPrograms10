


import java.io.*;
public class Buffered_PrimeNo {

   public static void main(String args[]) throws Exception
   {		
	int temp;
	boolean isPrime=true;
	InputStreamReader u = new InputStreamReader(System.in);
	BufferedReader pr = new BufferedReader(u);
	
	
	System.out.println("Enter any number:");

	int num=Integer.parseInt(pr.readLine());
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}