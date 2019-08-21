package studio7;
public class Complex {
	private double real, imaginary;
	
	public Complex (double a, double b) {
		this.real = a;
		this.imaginary = b;
	}
	/**
	 * 
	 * @return the String displaying the complex number
	 */
	public String toString () {
		return this.real + " + " + this.imaginary + " i";
	}
	/**
	 * 
	 * @param other is another complex number
	 * @return the sum of this and other, in complex
	 */
	public Complex add (Complex other) {
		return new Complex (this.real + other.real, this.imaginary + other.imaginary);
	}
	/**
	 * 
	 * @param other is another complex number
	 * @return the product of this and other, in complex
	 */
	public Complex multi (Complex other) {
		return new Complex (this.real * other.real - this.imaginary * other.imaginary, this.real * other.imaginary + other.real * this.imaginary);
	}
	/**
	 * 
	 * @return the Euclidean length of this complex number from 0 + 0i
	 */
	public double length () {
		return Math.sqrt(this.real * this.real + this.imaginary * imaginary);
	}
}