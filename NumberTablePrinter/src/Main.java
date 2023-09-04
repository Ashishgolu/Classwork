import java .util.Scanner;
public class Main {
	public static void printTable(int num)
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(num*i);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan=new Scanner(System.in);
   System.out.println("enter the number");
   int num=scan.nextInt();
   printTable( num);
	
	}

}
