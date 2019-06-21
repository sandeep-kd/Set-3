import java.util.*;
class Height
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		float height;
		System.out.println("Enter the height of the person in centimeters:");
		height = sc.nextFloat();
		
		if(height<150)
		{
			System.out.println("The person is dwarf");
		}
		else if(height>=150&&height<180)
		{
			System.out.println("The person has an average height");
		}
		else if(height>=180&&height<213)
		{
			System.out.println("The person is tall");
		}
		else
		{
			System.out.println("The person has abnormal height");
		}
		
	}
}