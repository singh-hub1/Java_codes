//To find the perimeter and area of a circle given a value of radius

import java.util.Scanner;
public class Exercise_1
{
  public static void main(String[] args)
   {
 	Scanner s=new Scanner(System.in);
                 double radius=s.nextDouble();
 	double perimeter;
	double area;
	if(radius<=0)
	{
	  System.out.println("please enter valid data");
	}
	
	else
	{
	perimeter=2*Math.PI*radius;
	area=Math.PI*radius*radius;
	System.out.println(perimeter);
	System.out.println(area);
	}
}
}