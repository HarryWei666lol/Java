package studio7;
public class RectangleFromCJZ {
	private double length, width, area, perimeter;
	/**
	 * 
	 * @param a - a is a double
	 * @param b - b is a double
	 * set up a rectangle's length and width
	 */
	public RectangleFromCJZ(double a, double b) {
		this.length = a;
		this.length = b;
	}
	/**
	 * 
	 * @return length * width, which is the rectangle's area, in double
	 */
	public double getArea() {
		return this.length * this.width;
	}
	/**
	 *
	 * @return the String displaying the rectangle's length and width
	 */
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	/**
	 * 
	 * @return 2 * length + 2 * width, which is the rectangle's perimeter, in double
	 */
	public double getPerimeter() {
		return this.length * 2 + this.width * 2;
	}
	/**
	 * 
	 * @param other - other is another object with the type "Rectangle"
	 * @return whether this rectangle's area is smaller than that of the other rectangle
	 */
	public boolean areaSmaller(Rectangle other) {
		return this.getArea() < other.getArea();
	}
	/**
	 * 
	 * @return whether this rectangle's length equals its width, which indicates if it is a square
	 */
	public boolean aSquare() {
		return this.length == this.width;
	}
}
