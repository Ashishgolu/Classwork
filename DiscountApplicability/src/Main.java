import java.util.Scanner;
public class Main {
	public static void checkDiscount(double purchageAmount)
	{
		if(purchageAmount>100)
		{
			System.out.println("Discount given");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Double purchageAmount = scan.nextDouble();
          checkDiscount(purchageAmount);
   
	}

}
