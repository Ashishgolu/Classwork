import java.util.Scanner;
public class Main {
	public static void identifyCharacter(char ch)
	{
		switch(ch)
		{
		case 'a':
			System.out.println("lower case vowel");
			break;
		case 'A':
			System.out.println("upper case vowel");
			break;
		case 'b':
			System.out.println("lower case consonent");
			break;
		case 'B':
			System.out.println("upper case consonent");
			break;
		case '1':
			System.out.println("digit");
			break;
		case'@':
			System.out.println("special character");
			break;
			}
		}
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character, digit or special character");
		char ch = scan.next().charAt(0);   
		identifyCharacter(ch);

	}

}
