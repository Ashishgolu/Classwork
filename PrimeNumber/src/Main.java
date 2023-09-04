import java.util.Scanner;
public class Main {
	public static boolean checkPrime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(n%i==0 )
			{
				return false;
			}
       		}
		         return true;
	}
public static void  printPrimes(int n)
{
	int count=0;
	for(int i=3;count<n;i++)
	{
		boolean res=checkPrime(i);
		if(res==true)
		{
			System.out.print(i+" ");
			count++;
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 System.out.println("enter the number");
 int n=scan.nextInt();
 printPrimes(n);
	}

	}


