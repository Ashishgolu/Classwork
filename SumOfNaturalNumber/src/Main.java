import java.util.Scanner;
public class Main {
	public static void calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
	
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan=new Scanner(System.in);
  System.out.println("enter the number");
  int n=scan.nextInt();
  calculateSum( n);
	}

}
