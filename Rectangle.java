import java.util.*;
class Rectangle
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int length,breadth,area,perimeter;
		System.out.println("Enter the length of the rectangle");
		length = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		breadth = sc.nextInt();
		area = length*breadth;
		perimeter = 2*(length+breadth);
		System.out.println("The area is:  " +area);
		System.out.println("The perimeter is:  " +perimeter);
		
		if(area>perimeter)
		{
			System.out.println("Area is greater than the Perimeter");
		}
		else
		{
			System.out.println("Perimeter is greater than Area");
		}
		
	}
}