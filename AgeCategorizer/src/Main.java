import java.util.Scanner;
public class Main {
	public static void categorizeAge(int age)
	{
		if(age<=12)
		{
			System.out.println("child");
		}
			else if(age<=19)
			{
				System.out.println("teen");
			}
			else if(age<=25)
			{
				System.out.println("Adult");
			}
			else
			{
				System.out.println("senior");
			}
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the age");
      int age=scan.nextInt();
      categorizeAge( age);
	}

}
