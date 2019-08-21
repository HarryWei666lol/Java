package exercises2;

import cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt(" How many times do you want to run the simulation? ");
		int sumNumFlips = 0;

		for (int i = 0; i < N; ++i) {

			int numHeads = 0;
			int numFlips = 0;


			while (numHeads != 10) {
				boolean isHeads = Math.random() < 0.5;
				if (isHeads) {
					numHeads = numHeads + 1;
				}
				numFlips = numFlips + 1;
			}


			sumNumFlips = sumNumFlips + numFlips ;	
			
		}
		System.out.println(" Average number of flips " + ( 1.0 * sumNumFlips / N ));
	}
}


