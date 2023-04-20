//Write a java method to calculate the sum of digits of a given number until the number is a 
//single digit. The method signature is as follows.
//public static int sum_Of_Digits(int n)

import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
int n = sc.nextInt();
while(n>10)
{
	n=sum_of_digits(n);
}
System.out.println("Sum of the digits of the given number = "+n);
	}
public static int sum_of_digits(int n)
{
	int sum = 0;
	while (n>0)
	{
		sum+=n%10;
		n=n/10;
	}
	return sum;
}
}
