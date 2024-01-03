package pattern;
public class star{
	public static void main(String[]args)
	{
	int space=10;
	    {	
	   for(int i=1;i<=5;i++)
		{
		for(int j=5;j<=space;j++)
				{
		System.out.print(" ");
		}
		space--;
		for(int k=1;k<=i;k++) {
			
		 System.out.print("* ");
		}
		 System.out.println();     
	        }
	      }
	    }
      }