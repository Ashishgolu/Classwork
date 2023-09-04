import java.util.Scanner;
public class Main {
   public static void printFibonacciSeries(int n)
   {
	   int fb1=0;
	   int fb2=1;
	if (n==1) 
	{
	System.out.println(fb1);
	}
	else if(n==2)
	{
	System.out.println(fb2);
	}
	else
		System.out.print(fb1+" "+fb2);
	for(int i=3;i<=n;i++)
	{
		int nextfb=fb1+fb2;
		System.out.print(" "+nextfb);
		fb1=fb2;
		fb2=nextfb;
	}
	
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number");
    int n= scan.nextInt();
    printFibonacciSeries(n);
	}

}
