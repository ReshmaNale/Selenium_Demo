package practice_basic_prog;

public class Even_odd_add
{
static int sum=0,add=0;

	public static void main(String[] args) 
	{
	for(int i=0;i<30;i++)
	{
		if(i%2==0)
		{
				System.out.print("Even no's are= ");
				System.out.print(" "+i);
				System.out.print("                                ");
				sum=sum+i;
				//System.out.print("                                 ");
				
			}
			else
			{
				//System.out.println(" ,"+i);
				System.out.println("Odd no's are= " +i);
				add=add+i;
				
			}
		}
	System.out.println("");
System.out.println("sum of Even No's= "+sum+"                           "+"Addition of Odd No'S="+add)
;	
			
	}

	}


