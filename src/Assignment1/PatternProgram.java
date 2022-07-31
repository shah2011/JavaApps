package Assignment1;

public class PatternProgram {

	public static void main(String[] args) {
		
// print Shah
		//print S		
		int n=9;
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++)
			{
				if(i==0 ||
					j==0 && i<(n-1)/2  || //i!=3
					i==(n-1)/2 ||
					j==n-1 && i>(n-1)/2  ||   //i!=1
					i==n-1 )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");  // to add space between S and A
			
			//print H
			for(int j=0; j<n; j++)
			{
				if(j==0 || j==n-1 ||i==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");  // to add space between H and A

			// print A
			for (int j=0; j<n; j++) 
			{
				if(i==0 && j!=0 && j!=n-1 ||
						j==0 && i!=0 ||
						i==(n-1)/2    ||
						j==n-1 && i!=0)
				System.out.print("*" );
				
				else
					System.out.print(" ");
			}

			System.out.print("  "); // to add space between S and H
			
			//print H
			for(int j=0; j<n; j++)
			{
				if(j==0 || j==n-1 ||i==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  " );  // to add space
			
			
		// print iNEURON
			//print I
			for (int j=0; j<n; j++) 
			{
				if (j==(n-1)/2 && i!=1 )
				System.out.print("*" );
				else
					System.out.print(" ");
			}
			
			System.out.print("");  // print space
			
			//print N
			for (int j=0; j<n; j++) 
			{
				if (j==0 ||
					i==j ||
					j==n-1
						)
				System.out.print("*" );
				else
					System.out.print(" ");
			}
			
			System.out.print("  " );  // to add space
			//print E
			for (int j=0; j<n; j++) 
			{
				if (j==0 ||
					i==0 ||
					i==(n-1)/2 ||
					i==n-1
						)
				System.out.print("*" );
				else
					System.out.print(" ");
			}
			
			System.out.print("  " );  // print space
			//print U
			for (int j=0; j<n; j++) 
			{
				if (j==0 ||
					i==n-1 ||
					j==n-1
						)
				System.out.print("*" );
				else
					System.out.print(" ");
			}
			
			System.out.print("  " );  // to add space
			//print R
			for (int j=0; j<n; j++) 
			{
				if (j==0 ||
					i==0 ||
					j==n-1 && i<=(n-1)/2 ||
					i==(n-1)/2 ||
					i==j && i>=(n-1)/2
					)
				System.out.print("*" );
				else
					System.out.print(" ");
			}
			
			System.out.print("  " );  // to add space
			//print O
			for (int j=0; j<n; j++) 
			{
				if (i==0 && j!=0 && j!=n-1 ||
					j==0 && i!=0 && i!=n-1 ||
					j==n-1 && i!=0 && i!=n-1 ||
					i==n-1 && j!=0 && j!=n-1
					)
				System.out.print("*" );
				else
					System.out.print(" ");
			}
			
			System.out.print("  " );  // to add space
			//print N
				for (int j=0; j<n; j++) 
				{
					if (j==0 ||
						i==j ||
						j==n-1
							)
					System.out.print("*" );
					else
						System.out.print(" ");
				}
			System.out.println();
			
			
		}
		System.out.println(" ");
		System.out.println("The End!");
		
	}

}
