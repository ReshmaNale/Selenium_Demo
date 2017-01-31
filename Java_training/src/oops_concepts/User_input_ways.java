package oops_concepts;
import java.util.Scanner;
import java.io.*;

import java.io.Console;
public class User_input_ways {

	public static void main(String[] args) throws IOException 
	{
		/**********Using Buffered Reader*************/
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name....");
	String str1=reader.readLine();
	System.out.println(" name ="+str1);
	
	/**********Using Scanner Class*************/
	Scanner scanner;
	scanner = new Scanner(System.in);
	System.out.println("Enter your Marks...");
	int marks=scanner.nextInt();
	System.out.println(" Marks ="+marks);
	
	/**********Using Console*************/
	
	Console console = System.console();

	   if (console==null){
	      System.out.print("console not available ");
	      System.exit(0);
	   }
	    System.out.print("your Hobby:"+console);
	     String h1=console.readLine();
	    // System.out.print("your name :"+line);
	}

}
