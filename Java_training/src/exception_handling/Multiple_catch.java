package exception_handling;

public class Multiple_catch 
{
		  public static void main(String args[])
		  {  
		   try
		   {  
		    int a[]=new int[5];  
		    a[6]=30/10;  
		    
		   }  
		   catch(ArithmeticException e){System.out.println("task1 is completed");}  
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
		   catch(Exception e){System.out.println("common task completed");}  
		  
		   System.out.println("rest of the code...");  
		 }  
		}  

