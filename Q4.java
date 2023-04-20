//Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r', 
//'b', 'o', and 'n' exactly once.


public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c[]= {'c','a','r','b','o','n'};
int count=0;
for(int i =0;i<c.length;i++)
{
	for(int j =0;j<c.length;j++)
	{
		for(int k =0;k<c.length;k++)
		{
			for(int l =0;l<c.length;l++)
			{
				for(int m =0;m<c.length;m++)
				{
					for(int n =0;n<c.length;n++)
					{
			if(i!=j&&i!=k && j!=k &&i!=l&& i!=m &&i!=n &&i!=j&&j!=l &&j!=m &&j!=n&& k!=l&& k!=m&& k!=n&&l!=m&&l!=n&&m!=n)
			{
			System.out.println(c[i]+""+c[j]+""+c[k]+""+c[l]+""+c[m]+""+c[n]);
			count++;
			
			}
		}
	}
}
		}
	}
}
System.out.println(count);
	}

}