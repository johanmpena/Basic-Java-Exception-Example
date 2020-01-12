/*
   Johan Pena
   01-12-2020
   Exception Example
 */

 import java.util.Scanner;						// Needed for Scanner class.
 import java.util.InputMismatchException;		// Needed for Input Mismatch Exception.
 public class ExceptionExample
 {
	 public static void main(String[] args) throws RuntimeException
	 {
		int x = 0;
		int y = 0;

		Scanner keyboard = new Scanner(System.in);					// Create instance of Scanner.
		try
		{
		System.out.println("Please Pick First Number: ");
		x = keyboard.nextInt();

		System.out.println("Please Pick Second Number: ");
		y = keyboard.nextInt();
		if(y == 0)
			throw new ArithmeticException();
		}
		catch(InputMismatchException e)
		{
			System.out.println("You did not entered a number.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by 0.");
		}

		System.out.println(x/y);
 	 }
 }