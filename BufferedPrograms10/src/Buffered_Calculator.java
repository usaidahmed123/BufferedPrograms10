import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Double;

public class Buffered_Calculator {
public static void main(String[] args) throws Exception {

  char operator;
  Double result;

  InputStreamReader IS = new InputStreamReader(System.in);
  BufferedReader input = new BufferedReader(IS);

  
  System.out.println("Choose an operator: +, -, *, or /");
  String on = input.readLine();
  operator=on.charAt(0);

  
  System.out.println("Enter first number");
  String number1 = input.readLine();
  Double n1 = Double.parseDouble(number1);
  

  System.out.println("Enter second number");
  String number2 = input.readLine();
  Double n2 = Double.parseDouble(number2);

  switch (operator) {

    // performs addition between numbers
    case '+':
      result = n1 + n2;
      System.out.println(n1 + " + " + n2 + " = " + result);
      break;

    // performs subtraction between numbers
    case '-':
      result = n1 - n2;
      System.out.println(n1 + " - " + n2 + " = " + result);
      break;

    // performs multiplication between numbers
    case '*':
      result = n1 * n2;
      System.out.println(n1 + " * " + n2 + " = " + result);
      break;

    // performs division between numbers
    case '/':
      result = n1 / n2;
      System.out.println(n1 + " / " + n2 + " = " + result);
      break;

    default:
      System.out.println("Invalid operator!");
      break;
  }

  input.close();
}
}