package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter denominetor other than zero value");
		}	
		
		try{
			
			PrintWriter pw=new PrintWriter("abc.txt");
			pw.println("Heloo");
		}catch(FileNotFoundException b){
			System.out.println("File not available at destination");
		}
	}
}
