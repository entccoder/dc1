Name: Rasal Ashwini 
Roll no: TE21

//Write a program in Java with class Rectangle with the data fields width, length, area and colour. The length, width and area are of double type and colour is of string type. The methods are get_length(), get_width(), get colour() and find area(). Create two objects of Rectangle and compare their area and colour. If the area and colour both are the same for the objects then display "Matching Rectangles", otherwise display" Non-matching Rectangle".



package project_1;
import java.util.Scanner;
public class Rectangle {
	double length,width,area;
	String colour;
	Scanner sc= new Scanner(System.in);
	public void get_length(){
		System.out.println("Enter the length of rectangle:");
		length=sc.nextDouble();
		}
	public void get_width(){
		System.out.println("Enter the width of rectangle:");
		width=sc.nextDouble();
		
	}
	public String get_colour() {
		System.out.println("Enter the colour of rectangle:");
		colour=sc.next();
		return colour;
		
	}
	public double find_area() {
		area=length*width;
		return area;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1,a2;
		Rectangle R1=new Rectangle();
		Rectangle R2=new Rectangle();
		System.out.println("Enter the detail of rectangle of R1... ");
		R1.get_length();
		R1.get_width();
		String c1=R1.get_colour();
		System.out.println("Colour of rectangle :"+c1);
		a1=R1.find_area();
		System.out.println("Area of rectangle is :"+a1);
		System.out.println(" Enter the detail of rectangle of R2...");
		R2.get_length();
		R2.get_width();
		String c2=R2.get_colour();
		System.out.println(" Colour of rectangle is: "+c2);
		a2=R2.find_area();
		System.out.println("Area of rectangle is :"+a2);
		if (a1==a2 &&(c1.compareTo(c2)==0)) {
			System.out.println("Matching rectangle");
		}
		else {
			System.out.println("NOn-matching rectangle");
		}
		

	}

}

O/P:
Enter the detail of rectangle of R1... 
Enter the length of rectangle:
20
Enter the width of rectangle:
30
Enter the colour of rectangle:
YELLOW
Colour of rectangle :YELLOW
Area of rectangle is :600.0
 Enter the detail of rectangle of R2...
Enter the length of rectangle:
10
Enter the width of rectangle:
80
Enter the colour of rectangle:
RED
 Colour of rectangle is: RED
Area of rectangle is :800.0
NOn-matching rectangle
