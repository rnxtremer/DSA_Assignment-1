//Write a java program to check whether a number is a spy number or not.

import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);


System.out.println("Enter a number");
int n =sc.nextInt();
int pro=1;
int sum=0;
while(n!=0)
{
	int rem= n%10;
	 sum=sum+rem;
	 pro=pro*rem;
	n=n/10;
	
}
if(pro==sum)
	System.out.println("Spy Number");
else
	System.out.println("Not a Spy Number");
	}

}