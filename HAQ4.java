//Write a method to add two matrices. The header of the method is as follows:
//public static double[][] addMatrix(double[][] a, double[][] b)
//In order to be added, the two matrices must have the same dimensions and the same or
//compatible types of elements

import java.util.Scanner;
public class HAQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter lenght of Row and column : ");
int m=sc.nextInt();
int n = sc.nextInt();
double x[][]= new double[m][n];
double y[][]= new double[m][n];
double z[][]= new double[m][n];
System.out.println("Enter elements of first array");
for (int i=0;i<m;i++)
	for (int j=0;j<n;j++)
		x[i][j]=sc.nextInt();
System.out.println("Enter elements of second array");
for (int i=0;i<m;i++)
	for (int j=0;j<n;j++)
		y[i][j]=sc.nextInt();
System.out.println("The addition of two Array is : " );
z=addMatrix(x,y);
for (int i=0;i<m;i++)
{
	for (int j=0;j<n;j++)
	{
	System.out.print(z[i][j]+" ");
	}
System.out.println();
}
	}
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		int row=a.length;
		int coloumn=a[0].length;
		double sum[][]= new double[row][coloumn];
		for (int i=0;i<row;i++)
			for (int j=0;j<coloumn;j++)
				sum[i][j]=a[i][j]+b[i][j];
		return sum;
	}
}
