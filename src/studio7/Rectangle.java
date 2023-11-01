package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	private double x;
	private double y;
	
	public Rectangle(double length, double width, double x, double y) {
		this.length = length;
		this.width = width;
		this.y = y;
		this.x = x;
	}
	
	public void area() {
		double area = length * width;
	}
	
	public void perimeter() {
		double perimeter = 2 * length + 2 * width;
	}
	
	public void square() {
		if (this.length == this.width) {
			boolean square = true;
		}
		if (this.length !=  this.width) {
			boolean square = false;
		}
	}
	
	public void draw() {
		StdDraw.filledRectangle(x, y, 0.5*width, 0.5*length);
	}



public double getLength()
{
	return length;
}

public double getWidth()
{
	return width;
}

public static void main(String[] args) {

Rectangle r1 = new Rectangle(3,3,3,3);

r1.area();
r1.draw();

}
}
