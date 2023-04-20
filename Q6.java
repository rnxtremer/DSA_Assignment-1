//Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
//method can't use the multiplication, modulus, or division operators, The method signature is 
//as follows.
//public static boolean isOdd(int n)

import java.util.Scanner;
public class Q6 {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	boolean a=isOdd(n);
	
	System.out.println("The Number is ODD :"+a);
}
	public static boolean isOdd(int n)
	{
		if((n &1)==1)
		{
			return true;
		}
		return false;
		
		
	}
}

