import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Buffered_Hello {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader hell = new InputStreamReader(System.in);
		BufferedReader hello = new BufferedReader(hell);
		System.out.println("Put ur words here carefully");
		String c = hello.readLine();
		System.out.println("this is your Words:\n"+c);
	}

}
