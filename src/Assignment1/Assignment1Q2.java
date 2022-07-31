// Write a program to print
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4
package Assignment1;

public class Assignment1Q2 
	{public static void main(String[] args) 
	
		{int n=4;
			for(int i=0; i<n; i++)
			{
				for (int j=0; j<n; j++) 
				{			
					if(i==0)
					System.out.print("1");
					else if(i==1)
					System.out.print("2");
					else if(i==2)
					System.out.print("3");
					else if(i==3)
					System.out.print("4");
				}
				System.out.println("");
			
			}
		
		}
	}

