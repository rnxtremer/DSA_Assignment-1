//Write a Java program that can take a positive integer greater than 2 as input and write out the
//number of times one must repeatedly divide this number by 2 before getting a value less
//than 2.

import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
int n = sc.nextInt();
int count =0;
while (n/2>=2)
{
	n=n/2;
	count++;
}
System.out.println("The number is "+count+" times divisible by 2");
	}

}
