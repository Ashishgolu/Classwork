package pattern56;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int n=10;
		for(int i=0;i<=n;i++)
		{
	         for(int j=0;j<=n;j++)			
	         {
		        if(i==0||j==n-i||i==n)
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
