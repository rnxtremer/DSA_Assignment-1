//Write a java program to print M-by-N array in the tabular format. Also, display the sum of 
//elements of the array.


import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter row and column of the array");
int  m =sc.nextInt();
int n =sc.nextInt();
int arr[][]=new int[m][n];
System.out.println("enter "+(m*n)+" elements of array");
int sum=0;
for(int i =0;i<m;i++)
{
	for (int j=0;j<n;j++)
	{
		arr[i][j]=sc.nextInt();
		sum=sum+arr[i][j];
	}
}
for(int i =0;i<m;i++)
{
	for (int j=0;j<n;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
System.out.println("Sum of total element is : "+sum);
	}
}