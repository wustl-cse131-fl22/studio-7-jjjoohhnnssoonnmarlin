package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length2, double width2) {
		length = length2;
		width = width2;
	}

//	public void Rectangle (double lengthCopy, double widthCopy) {
//		length = lengthCopy;
//		width = widthCopy;
//	}
	
	public double area (double length, double width) {
		double area = length * width;		
		return area;
	}
	
	public double perimeter (double length, double width) {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	
	public boolean smaller (double length1, double width1, double length2, double width2) {
		boolean smaller = false;
		if (area(length1, width1) < area(length2, width2)) {
			smaller = true;
		}
		return smaller;
	}
	
	public boolean square (double length, double width) {
		boolean square = false;
		if (length == width) {
			square = true;
		}
		return square;
	}
	
	
	public static void main(String[] args) {
		double length = 3;
		double width = 2;
		Rectangle r = new Rectangle (length, width);
		double length2 = 7;
		double width2 = 5;
		Rectangle r2 = new Rectangle (length2, width2);
		System.out.println(r.area(length, width) + " " + r2.area(length2, width2));
		System.out.println(r.smaller(length, width, length2, width2));
		

	}

}
