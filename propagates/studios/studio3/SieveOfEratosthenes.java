package studio3;

import cse131.ArgsProcessor;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArgsProcessor ap = new ArgsProcessor(args);
	int n = ap.nextInt("Enter the maximum number n:");
	int[] sieve = new int[n];
	for (int i = 0; i < n; i++) {
		sieve[i] = i+2;
	}
	for (int i = 0; i < n; i++) {
		if (sieve[i] != 0) {
			for ()
		}
	}
	for (int i = 1; i < n/2; i++) {
		if (sieve[2*i] == 2*(i+1)) {
			sieve[2*i] = 0;
		}
	}
	for (int i = 0; i < (n-4)/3; i++) {
		if (sieve[3*i+4] == 3*i+6) {
			sieve[3*i+4] = 0;
		}
	}
	for (int i = 0; i < (n-8)/5; i++) {
		if (sieve[5*i+8] == 5*i+10) {
			sieve[5*i+8] = 0;
		}
	}
	for (int i = 1; i < (n-5)/7; i++) {
		if (sieve[7*i+5] == 7*i+7) {
			sieve[7*i+5] = 0;
		}
	}
	System.out.print("Primes under " + n + " = ");
	for (int i = 0; i < n; i++) {
		if (sieve[i] !=0) {
			if (sieve[i] < n) {
				System.out.print(sieve[i] + ", ");
			}
			
		}
		
	}
	
	}

}
