import java.util.*;
class Largest
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		System.out.println("Enter the 1st number:");
		n1 = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		n2 = sc.nextInt();
		System.out.println("Enter the 3rd number:");
		n3 = sc.nextInt();
		System.out.println("Enter the 4th number:");
		n4 = sc.nextInt();
		System.out.println("Enter the 5th number:");
		n5 = sc.nextInt();
		System.out.println("Enter the 6th number:");
		n6 = sc.nextInt();
		System.out.println("Enter the 7th number:");
		n7 = sc.nextInt();
		System.out.println("Enter the 8th number:");
		n8 = sc.nextInt();
		System.out.println("Enter the 9th number:");
		n9 = sc.nextInt();
		System.out.println("Enter the 10th number:");
		n10 = sc.nextInt();
		
		if(n1>n2  && n1>n3 && n1>n4 && n1>n5 && n1>n6 && n1>n7 && n1>n8 && n1>n9 && n1>n10)
		{
			System.out.println("The 1st number is greater");
		}
		else if(n2>n1 && n2>n3 && n2>n4 && n2>n5 && n2>n6 && n2>n7 && n2>n8 && n2>n9 && n2>n10)
		{
			System.out.println("The 2nd number is greater");
		}
		else if(n3>n1 && n3>n2 && n3>n4 && n3>n5 && n3>n6 && n3>n7 && n3>n8 && n3>n9 && n3>n10)
		{
			System.out.println("The 3rd number is greater");
		}
		else if(n4>n1 && n4>n2 && n4>n3 && n4>n5 && n4>n6 && n4>n7 && n4>n8 && n4>n9 && n4>n10)
		{
			System.out.println("The 4th number is greater");
		}
		else if(n5>n1 && n5>n2 && n5>n3 && n5>n4 && n5>n6 && n5>n7 && n5>n8 && n5>n9 && n5>n10)
		{
			System.out.println("The 5th number is greater");
		}
		else if(n6>n1 && n6>n2 && n6>n3 && n6>n4 && n6>n5 && n6>n7 && n6>n8 && n6>n9 && n6>n10)
		{
			System.out.println("The 6th number is greater");
		}
		else if(n7>n1 && n7>n2 && n7>n3 && n7>n4 && n7>n5 && n7>n6 && n7>n8 && n7>n9 && n7>n10)
		{
			System.out.println("The 7th number is greater");
		}
		else if(n8>n1 && n8>n2 && n8>n3 && n8>n4 && n8>n5 && n8>n6 && n8>n7 && n7>n9 && n7>n10)
		{
			System.out.println("The 8th number is greater");
		}
		else if(n9>n1 && n9>n2 && n9>n3 && n9>n4 && n9>n5 && n9>n6 && n9>n7 && n9>n8 && n9>n10)
		{
			System.out.println("The 9th number is greater");
		}
		else if(n10>n1 && n10>n2 && n10>n3 && n10>n4 && n10>n5 && n10>n6 && n10>n7 && n10>n8 && n10>n9)
		{
			System.out.println("The 10th number is greater");
		}
		else
		{
			System.out.println("Two or more numbers you entered are equal");
		}
	}
}