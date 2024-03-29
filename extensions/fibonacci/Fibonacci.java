package fibonacci;

public class Fibonacci {

	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {//
		if(n <= 1) {
			return n;
		}
		else {
			return recursive(n-1) + recursive(n-2);
		}
	}

	public static void main(String[] args) {
		System.out.println(iterative(1));
	}

	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {//
		int a = 0;
		int b = 1;
		int c = 1;
		if(n > 1) {
			for(int i = 0; i < n-2; i++) {
				a = b;
				b = c;
				c = a + b;
			}
			return c;
		}
		else {
			return n;
		}
		
	}

}
