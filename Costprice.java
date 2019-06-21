import java.util.*;
class Costprice
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int cp,sp,profit,loss;
		System.out.println("Enter the Cost Price of the item:");
		cp = sc.nextInt();
		System.out.println("Enter the Selling Price of the item:");
		sp = sc.nextInt();
		
		if(sp>cp)
		{
			System.out.println("You have made a Profit");
			profit = sp-cp;
			System.out.println("You have made a profit of RS:  " +profit);	
		}
		else if(cp>sp)
		{
			System.out.println("You have made a Loss");
			loss = cp-sp;
			System.out.println("You have made a loss of RS:  " +loss);
		}
		else
		{
			System.out.println("The Cost Price and Selling Price are equal");
		}
	}
}