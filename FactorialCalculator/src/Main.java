import java.util.Scanner;
public class Main {
	public static void calculateFactorial(int n)
	{
		int count=1;
		for(int i=1;i<=n;i++)
		{
		
	 count=count*i;

		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan=new Scanner (System.in);
  System.out.println("enter the number");
  int n=scan.nextInt();
  calculateFactorial( n);
	}

}
