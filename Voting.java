import java.util.*;
class Voting
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter the age of the candidate:");
		age = sc.nextInt();
		
		if(age<18)
		{
			System.out.println("The candidate is not eligible for voting");
		}
		else
		{
			System.out.println("The candidate is eligible for voting");
		}
	}
}