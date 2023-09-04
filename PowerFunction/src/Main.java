import java.util.Scanner;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      System.out.println("enter the power");
      int p=scan.nextInt();
      double result = Math.pow(n,p);
      System.out.println(result);
	}

}
