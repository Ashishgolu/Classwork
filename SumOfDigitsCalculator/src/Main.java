import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		calculateSumOfDigits(n);

	}
	public static void calculateSumOfDigits(int n)
	{
		int sum=0 ,ld;
		while(n>0)
		{
			ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		System.out.println(sum);
	}

}
