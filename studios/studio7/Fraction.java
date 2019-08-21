package studio7;
public class Fraction {
	private int numerator, denominator;
	
	public Fraction (int a, int b) {
		this.numerator = a;
		this.denominator = b;
	}
	/**
	 * 
	 * @param other is another type Fraction object
	 * @return the sum of this and other, in Fraction
	 */
	public Fraction sum (Fraction other) {
		Fraction a = new Fraction(0,0);
		a.denominator = this.denominator * other.denominator;
		a.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
		return a;
	}
	/**
	 * 
	 * @param other is another type Fraction object
	 * @return the product of this and other, in Fraction
	 */
	public Fraction multi (Fraction other) {
		Fraction a = new Fraction (0,0);
		a.denominator = this.denominator * other.denominator;
		a.numerator = this.numerator * other.numerator;
		return a;
	}
	/**
	 * 
	 * @return the reciprocal of this Fraction, in Fraction
	 */
	public Fraction reci () {
		Fraction a = new Fraction (0,0);
		a.denominator = this.numerator;
		a.numerator = this.denominator;
		return a;
	}
	/**
	 * 
	 * @return the simplified form of this Fraction, in Fraction
	 */
	public Fraction simplify () {
		int temp = (numerator <= denominator) ? numerator : denominator;
		int n1 = 0;
		int n2 = 0;
		for(int i = temp ; i > 0; i--){
			if (this.numerator % i == 0 && this.denominator % i == 0) {
				n1 = this.numerator / i;
				n2 = this.denominator / i;
				i = 0;// leave the loop
			}
		}
		return new Fraction (n1, n2);
	}
	/**
	 * 
	 * @return the String displaying the numerator and denominator of the fraction
	 */
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}
	/**
	 * 
	 * @param other is another Fraction
	 * @return whether this is smaller than, equal to, or bigger than other
	 */
	public String comparison(Fraction other) {
		int temp = this.numerator * other.denominator - this.denominator * other.numerator;
		temp = (this.denominator * other.denominator < 0) ? temp/(-1) : temp;
		if(temp > 0) {
			return "bigger";
		}
		else if(temp == 0) {
			return "equal";
		}
		else {
			return "smaller";
		}
		
	}
}

