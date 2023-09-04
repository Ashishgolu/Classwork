import java.util.Scanner;
public class Main {
	public static void findGCD(int a, int b)
	{
		int rem;
		while(a%b!=0)
		{
		  rem=a%b;
		  a=b;
		  b=rem;
		}
		System.out.println("GCD"+" "+ b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan=new Scanner(System.in);
		  System.out.println("enter 1st number");
         int a=scan.nextInt();
       System.out.println("enter 2nd number");
       int b=scan.nextInt();
       findGCD( a, b);
	}

}
