import java.io.*;
public class Buffered_MultiplicationTable {


    

    public static void main(String[] args) throws Exception

    {

    	InputStreamReader u = new InputStreamReader(System.in);
      	BufferedReader s= new BufferedReader(u);

	System.out.print("Enter number:");        

	int n=Integer.parseInt(s.readLine());

        for(int i=1; i <= 10; i++)

        {

            System.out.println(n+" * "+i+" = "+n*i);

        }

    }

}


