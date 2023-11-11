
public class INEURON 
{
	public static void main(String []args)
	{
		int n=7;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) //this part is for I letter
			{
				if((j==(n-1)/2) || i==0 || i==n-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for N letter
			{
				if((i==j) || (j==0) || (j==n-1))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for E letter
			{
				if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for U letter
			{
				if((j==0 && i<n-1) || (j==n-1 && i <n-1)||
						(i==n-1) && j>0 && j<n-1
						)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) // this part is for R letter
			{
				if((i==0 && j<n-1) || 
						j==0 || 
						i==(n-1)/2 && j<(n-1) || 
						(j==n-1 && i>0 && i<(n-1)/2) || 
						i==j && i>=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for O letter
			{
				if((i==0 && j>0 && j<n-1)||
						(i==n-1) && j>0 && j<n-1 || 
						(j==0 && i>0 && i<n-1 || 
						(j==n-1) && i>0 && i<n-1))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) //this part is for N letter
			{
				if((i==j) || (j==0) || (j==n-1))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
