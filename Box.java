import java.util.Scanner;

class Box
{
	float length, width, height;
 	public Box(float l, float w, float h)
 	{
 	 length=l;
 	 width=w;
 	 height=h;
	 }
 	public float volume()
 	{ 
 	 return length*width*height;
	}
}

class Demo
{
	public static void main(String[] args)	
	{
	 float length, width, height;
	 Scanner s = new Scanner (System.in);
	 System.out.println("Enter Length, Width, Height of box");
	 length=s.nextFloat();
	 width=s.nextFloat();
 	 height=s.nextFloat();
	Box inputBox= new Box(length, width, height);
	float boxVol= inputBox.volume();
	
	System.out.println("volume of the box is- " +boxVol);
	}
}
	 
	
	 