package method_loding_riding;
import java.util.*;
import java.io.*;

public class Main_overload_str
	{  	
	/********************passing 1_d string array*************************/
	    public static void main(String[] strArray,int j)
	    {  	
	    	for(int i=0;i<strArray.length;i++)
	    	{
	    		System.out.println("   "+strArray[i]);
	    	}
	    	System.out.println("   "+j);
	    	
	    System.out.print (Arrays.toString(strArray)+"  "+j);			//To access each element of array use array's method 
	    }
	    /********************passing 2_d string array*************************/
	    //we cant use length function diretly for 2d array.instead we use following 
	    public static void main(String[][]array,int s)
	    {  	
	    	System.out.println("      ");
	    	for(int i=0; i<array.length; i++)
	    	{
	    		for(int j=0; j<array[i].length; j++)
	    		{
	    		System.out.println("   "+array[i][j]);
	    		}
	    	}
	    	System.out.println(" "+s);
	    	System.out.println(Arrays.deepToString(array)+"  "+s);			
	    }
	    /********************passing character value*************************/
	    public static void main(char n)
	    {
	    	Scanner scanner;
	    	scanner = new Scanner(System.in);
	    	System.out.println("Enter your Marks...");
	    	int marks=scanner.nextInt();
	    	System.out.println(" Marks ="+marks+" "+" charvalue ="+n);
	       // System.out.println("this is "+n);
	    }
	    /********************calling here all overloaded main methods*************************/
	    public static void main(String args[]) throws Exception
	    {
	    	String[] strArray = new String[]{"Foo","rahul","piu"};
	     	String[][]array = new String[][] { {"Foo","rahul","piu"},{"anu","sonu","monu"} };
	    	int i =10;
	    	int s=50;
	    	main('R');
	    	main(strArray,i);
	    	main(array,s);
	    }
	}
