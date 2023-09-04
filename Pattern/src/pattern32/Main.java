package pattern32;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=9;i++)
		{
	         for(int j=1;j<=10;j++)			
	         {
				if(i==1||j==1||j==10||i==5)
					{
					System.out.print("*");
					}
				else
				{
					System.out.print(" ");
				}
				}
				System.out.println();
			}

	}

}
