package hw1;
import java.util.*;
import java.io.*;
public class Area {
	private double length,width;
	
public void Area(double length,double width) {
	this.length = length;
	this.width = width;
}
	
	public void setDim(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
	public static void main(String args[]) {
		try {
		Area rectangle  = new Area();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter length of rectangle: ");
//		double length = sc.nextDouble();
//		System.out.print("Enter width of rectangle: ");
//		double width = sc.nextDouble();
//		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter length: ");
double length = Double.parseDouble(br.readLine());

System.out.print("Enter width: ");
double width = Double.parseDouble(br.readLine());

rectangle.setDim(length, width);

		
		System.out.print("Area of rectangle: "+rectangle.getArea());
		}
		catch(IOException e) {
			System.out.println(e);
		}
//		sc.close();
	}
}
