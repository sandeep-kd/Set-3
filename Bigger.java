import java.util.*;
class Bigger
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter the First number:");
		n1 = sc.nextInt();
		System.out.println("Enter the Second number:");
		n2 = sc.nextInt();
		System.out.println("Enter the Third number:");
		n3 = sc.nextInt();
		
		if(n1==n2 && n1==n3)
		{
			System.out.println("All are equal");
		}
		else if(n1==n2 && n2>n3 && n1>n3)
		{
			System.out.println("First and Second Number are Largest");
		}
		else if(n1>n2 && n3>n2)
		{
			System.out.println("First and Third Number are Largest");
		}
		else if(n2==n3 && n2>n1 && n3>n1)
		{
			System.out.println("Second and Third Number are Largest");
		}
		else if(n1>n2 && n1>n3)
		{
			System.out.println("First Number is Largest");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Second Number is Largest");
		}
		else if(n3>n1 && n3>n2)
		{
			System.out.println("Third Number is Largest");
		}
	}	
		
}