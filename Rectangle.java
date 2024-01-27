import java.util.Scanner;

class Rectangle
{
	float length, breadth, area, perimeter;

public Rectangle(float l, float b)
	{
	length=l;
	breadth=b;
	}
public void read()
	{
	System.out.println("Enter length and breadth of Rectangle");

 	Scanner s= new Scanner(System.in);
	length=s.nextFloat();
	breadth=s.nextFloat();
}
public void calculate()
	{
	area=length*breadth;
	perimeter=length+breadth;
	}
public void display()
	{
	System.out.println("Area of recatangle is " +area);
	System.out.println("Perimeter of rectangle is " +perimeter);
	}
}

class Demo
{
	public static void main(String[] args)
	{
	float length, breadth;

	{
	 Rectangle newrect= new Rectangle(1,2);
	 newrect.read();
	 newrect.calculate();
	 newrect.display();
	}
	}
}
	 
