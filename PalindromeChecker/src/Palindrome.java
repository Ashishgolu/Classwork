
public class Palindrome {
	public static void calculatePalindrome(int n)
	{
		int original=n,ld,rev=0;
		while(n>0)
		{
			ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
			if(original==rev)
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
			
	}

}
