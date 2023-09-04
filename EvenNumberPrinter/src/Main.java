import java.util.Scanner;
public class Main {
  public static void printEvenNumbers(int n)
  {
	  for(int i=1;i<=10;i++)
	  {
		if(i%2==0)
		{
			System.out.println(i);
		}
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan =new Scanner (System.in);
  System.out.println("enter the number");
  int n=scan.nextInt();
  printEvenNumbers(n);
	}

}
