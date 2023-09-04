import java.util.Scanner;
public class Main {
	public static void getProduct(String productCode)
	{
	  switch(productCode)
	  {
	  case "p01":
		  System.out.println("coco cola");
		  break;
	  case "p02":
		  System.out.println("fanta");
		  break;
	  case "p03":
		  System.out.println("jal jira");
		  break;
	  case "p04":
		  System.out.println("mountain due");
		  break;
		  default:
			  System.out.println("drink be panaka");
			  
	  }
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan=new Scanner(System.in);
  System.out.println("enter the product code");
 String  productCode=scan.next(); 
 getProduct( productCode);
	}

}
