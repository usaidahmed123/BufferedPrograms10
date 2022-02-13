import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Buffered_Add {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader hell = new InputStreamReader(System.in);
		BufferedReader hello = new BufferedReader(hell);
		System.out.println("Put ur first no. to add");
		int c = Integer.parseInt(hello.readLine());
		System.out.println("Second no. plz");
		int b = Integer.parseInt(hello.readLine());
		int A = b+c;
		System.out.println("Your sum for the no.s you provided is:\n"+A);
	}

}
