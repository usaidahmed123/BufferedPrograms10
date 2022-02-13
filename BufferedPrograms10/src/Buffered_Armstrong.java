import java.io.*;

public class Buffered_Armstrong {



	    public static void main(String[] args) throws Exception {

	        int num, number, temp, total = 0;
	        System.out.println("Ënter 3 Digit Number");
	        InputStreamReader u = new InputStreamReader(System.in);
	      	BufferedReader arm = new BufferedReader(u);
	        
	        num = Integer.parseInt(arm.readLine());
	       
	        number = num;

	        for( ;number!=0;number /= 10)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	        }

	        if(total == num)
	            System.out.println(num + " is an Armstrong number");
	        else
	            System.out.println(num + " is not an Armstrong number");
	    }
	}


