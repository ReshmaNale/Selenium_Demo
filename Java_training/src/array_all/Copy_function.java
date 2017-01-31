package array_all;

import java.util.Arrays;

public class Copy_function
{

	public static void main(String[] args) 
	{

		  int[][] src={{1,2,3},{4,5,6}}; 
		  int[][] dst  ;
		  dst  = new int[src.length][];	    
	     System.arraycopy(src, 0,dst,0,1);
	     
	     for(int i=0;i<src.length;i++)
			{
				for(int j=0; j<src[i].length; j++)
				{
					dst[i][j]=src[i][j];
					System.out.print("  "+dst[i][j]+"  ");
				}
				System.out.println("   ");
			}
	    }

	}
	

	

