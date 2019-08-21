package book;

public class Prime {
	public static void main(String Args[]) {
		int n = 103;
		int factor;
		for ( factor = 2; factor < n; factor++) {
			if(n % factor ==0) {
				break;
			}
		}
		if (factor > n/factor) {
			System.out.println(n + " is prime");
		}
		else {
			System.out.println(n+ " is not prime");
		}
	}

}

