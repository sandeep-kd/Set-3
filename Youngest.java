import java.util.*;
class Youngest
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a1,a2,a3;
		System.out.println("Enter the age of the Ram:");
		a1 = sc.nextInt();
		System.out.println("Enter the age of the Shyam:");
		a2 = sc.nextInt();
		System.out.println("Enter the age of the Ajay:");
		a3 = sc.nextInt();
		
		if(a1<a2 && a1<a3)
		{
			System.out.println("Ram is Youngest");
		}
		else if(a2<a1 && a2<a3)
		{
			System.out.println("Shyam is Youngest");
		}
		else if(a3<a2 && a3<a1)
		{
			System.out.println("Ajay is Youngest");
		}
		else
		{
			System.out.println("Ages are clashing");
		}
		
		
		
		
	}
}