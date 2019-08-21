package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  // FIXME
	}
	
	/**
	 * 
	 * @param x first integer
	 * @param y second integer
	 * @param z third integer
	 * @return the average of the 3 integers (expressed as a double)
	 */
	public static double avg3(int x, int y, int z) {
		return (x+y+z)/3.0;
	}
	
	
	public static double sumArray(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	
	public static double average(double[] array) {
		return sumArray(array)/array.length;
	}
	
	
	public static int factorial(int x) {
		int answer = 1;
		for (int i = x; i >= 1; i--) {
			answer = answer * i;
		}
		return answer;
	}
	
	public static String pig(String s) {
		String body = s.substring(1);
		String first = s.substring(0, 1);
		return body + first + "ay";
	}

}
