package studio7;

public class Rectangle {

	private double length, width, area, perimeter;
	private boolean isSquare;

	/**
	 * This is the constructor
	 * @param length
	 * @param width
	 */

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.area = length * width;
		this.perimeter = 2*length + 2*width;
		if (this.length == this.width) {
			isSquare = true;
		}
		else{
			isSquare = false;
		}
	}
	/**
	 * getter
	 * @return length
	 */

	public double getLength() {
		return length;
	}
	/**
	 * setter
	 * @param length
	 */

	public void setLength(double length) {
		this.length = length;
	}
	/**
	 * getter
	 * @return width
	 */

	public double getWidth() {
		return width;
	}

	/**
	 * setter
	 * @param width
	 */

	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * getter
	 * @return area
	 */

	public double getArea() {
		return area;
	}
	/**
	 * getter
	 * @return perimeter
	 */

	public double getPerimeter() {
		return perimeter;
	}
	/**
	 * getter
	 * @return isSquare
	 */

	public boolean getIsSquare() {
		return isSquare;
	}
	/**
	 * Method
	 * @param otherRect
	 * @return true or false
	 */

	public boolean isSmaller(Rectangle otherRect) {
		if (this.area < otherRect.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Method
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + ", perimeter=" + perimeter
				+ ", isSquare=" + isSquare + "]";
	}
	

	public static void main(String[] args) { // testing
		Rectangle one = new Rectangle(2, 3);
		Rectangle two = new Rectangle (2, 2);
		System.out.println(one.toString());
		System.out.println(two.toString());
		one.isSmaller(two);
		System.out.println(one.isSmaller(two));
		two.isSmaller(one);
		System.out.println(two.isSmaller(one));
	}
}
