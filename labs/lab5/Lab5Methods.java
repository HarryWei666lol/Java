package lab5;

public class Lab5Methods {
	/**
	 * 
	 * @param n an integer 
	 * @return n+ (n-2) +( n-4)+ ...
	 */
	

	public static int sumDownBy2 (int n) {
		if( n <= 0) {
			return 0;
		}
		else {
			int sum = 0;
			for (int i = 0; i <= n /2; i++) {
				sum = sum + n - 2*i;
			}
			return sum;
		}
	}
	/**
	 * 
	 * @param n a positive double
	 * @return Sum of (1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n)
	 */


	public static double harmonicSum( double n) {
		if ( n ==1) {
			return 1;
		}
		else  {
			double sum = 0;
			for( double i = 1.0; i <= n; i++) {
				sum = sum + 1.0/ i;
			}
			return sum;
		}
	}

	/**
	 * 
	 * @param k a non-negative double 
	 * @return sum of (1 + 1/2 + 1/4 + 1/8 + ... + 1/Math.pow(2,k))
	 */


	public static double geometricSum ( double k) {
		double sum = 0;
		for ( double i = 0.0; i <= k; i++) {
			sum = sum + 1/(Math.pow(2.0, i));
		}
		return sum;
	}
	/**
	 * 
	 * @param a a positive integer 
	 * @param b a negative integer 
	 * @return product of a and b
	 */


	public static int multPos (int a,int b) {
		int result = 0;
		if (a > 0 && b > 0) {
			for (int i = 0; i < b;i++) {
				result = result + a;
			}
		}
		return result;
	}
	/**
	 * 
	 * @param c an integer
	 * @param d another integer
	 * @return the product of c*d
	 */


	public static int multAny(int c,int d) {
		int result = 0;
		if (c > 0 && d > 0) {
			result = multPos(c,d);	
		}
		
		if (c < 0 && d < 0) {
			result = multPos(Math.abs(c), Math.abs(d));	
		}
		else if (c < 0 && d > 0) {
			result = -(multPos(Math.abs(c), d));	
		}
		else if (d < 0 && c > 0) {
			result = -(multPos(Math.abs(d), c));
		}
		return result;
	}
	/**
	 * 
	 * @param n an integer 
	 * @param k another integer
	 * @return the value of n to the power k
	 */


	public static int expt ( int n, int k) {
		int result = 1;
		if ( k >= 0) {
			for( int i =1 ; i <=k; i++) {
				result = result * n;
			}
		}
		return result;
	}
}
