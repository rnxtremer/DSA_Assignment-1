//Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
//values using the following header:
//public static double sumMajorDiagonal(double[][] m)


import java.util.Scanner;
public class Q9 {

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter row and column of the array");
	  double n =sc.nextInt();
		double arr[][]=new double[n][n];
		System.out.println("enter "+(n*n)+" elements of array");
		
		for(int i =0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextDouble();
		
			}
		}
		for(int i =0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	    double sum = sumMajorDiagonal(arr);
		System.out.println("Sum of the Major Diagonal "+sum);
		
	}
		public static double sumMajorDiagonal(double[][] m)
			
		{double sum=0;
			for(int i =0;i<m.length;i++)
			{
				for (int j=0;j<m.length;j++)
				{
					if(i==j)
					{
						sum+=m[i][j];
					}
				}
				return sum;
			}
		}
	}

				
		
		



