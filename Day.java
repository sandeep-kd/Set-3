import java.util.*;
class Day
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("Enter the day number from 1-7 for the equivalent day name:");
		day = sc.nextInt();
		
		if(day==1)
		{
			System.out.println("The day name is Monday");
		}
		else if(day==2)
		{
			System.out.println("The day name is Tuesday");
		}
		else if(day==3)
		{
			System.out.println("The day name is Wednesday");
		}
		else if(day==4)
		{
			System.out.println("The day name is Thrusday");
		}
		else if(day==5)
		{
			System.out.println("The day name is Friday");
		}
		else if(day==6)
		{
			System.out.println("The day name is Saturday");
		}
		else if(day==7)
		{
			System.out.println("The day name is Sunday");
		}
		else
		{
			System.out.println("The number you entered is Invalid ");
		}
		
	}
}