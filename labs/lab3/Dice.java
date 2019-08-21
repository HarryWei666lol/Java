package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numDice = ap.nextInt("How many dice do you want to use in this simulation?");
		int numTimes = ap.nextInt("How many times do you want to throw each dice? ");
		System.out.println("We are throwing " + numDice + " dice and the dice will be thrown " + numTimes + " times");
		int [] numbers = new int [numDice];
		int frequencyAll = 0;
		int sum = 0;
		
		int [] sumArrays = new int[numTimes];
		int []frequency = new int [6 * numDice];

		for (int j = 0; j < numTimes; j++) {
			sum = 0;
			for (int i = 0; i < numDice; i++) {
				int t = (int)(Math.random() * 6 +1);
				numbers[i] = t;
				sum = sum + t;
				System.out.print( numbers[i]  +  "  " );
				
			}
			sumArrays[j] = sum;
			frequency [sum-1]++;
			int a = 0;
			for (a = 0 ; a < numDice - 1; a++) {
				if (numbers[a] == numbers[a + 1]) {

				}
				//to exit the loop
				else { 
					a = numDice + 2;
				}
			}
			if ( a == numDice - 1) {
				frequencyAll ++; 
			}
			System.out.print( "|The sum of " + numDice + " dice is " + sum );
			System.out.println( );
		}
		double realFrequencyAll = (Math.round((frequencyAll * 1.0 / numTimes ) * 1000)) / 10.0;
		System.out.println( "The number of times when all dice displayed the same outcome is " + realFrequencyAll + "%" );
		System.out.print( "The possible sums are " );
		for (int j = 0; j < numTimes; j++ ) {
			System.out.print( sumArrays[j] + " ");
		}
		System.out.println( );
		for (int f = 0; f < 6 * numDice ; f++) {
			if (frequency [f] != 0) {
				double realFrequency = (Math.round((frequency[f] * 1.0 / numTimes) * 1000)) / 10.0;
				System.out.println( "The sum " + (f+1) + " showed up " + frequency[f] + " times and the percentage is " + realFrequency + "%" );
			}
		}
	}
}


