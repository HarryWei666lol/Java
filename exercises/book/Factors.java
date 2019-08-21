package book;

public class Factors {// print the prime factorization of n
	public static void main(String[] args) {
		long n = 3757208;
		for( long factor = 2; factor <= n/factor; factor++) { // factor < n
			// test potential factor
			while ( n % factor == 0) {// cast out and print factor
				n /= factor;
				System.out.println(factor + " ");
				// any factor of n must be greater than factor
			}
		}
		if( n > 1) { // print out the final prime factor
			System.out.print(n);
		}
	
	}

}
