import java.util.*;
class Triangle
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3,sum;
		System.out.println("Enter the 1st side of a triangle:");
		s1 = sc.nextInt();
		System.out.println("Enter the 2nd side of a triangle:");
		s2 = sc.nextInt();
		System.out.println("Enter the 3rd side of a triangle:");
		s3 = sc.nextInt();
		sum = s1+s2+s3;
		
		if(sum==180)
		{
			System.out.println("The traingle is valid");
		}
		else
		{
			System.out.println("Not a valid triangle");
		}
		
		
	}
}