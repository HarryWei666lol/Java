package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int computerOrHuman = ap.nextInt("Do you want to start the game? 1 for Yes or 2 for No ");
		if (computerOrHuman == 1) {
			System.out.println("Human starts ");	
		}
		if (computerOrHuman == 2) {
			System.out.println("Computer starts ");
		}
		int initialNumSticks = ap.nextInt("What is the starting number of sticks? ");
		int roundNumber = 0;
		int numSticksRemaining = initialNumSticks;
		//
		if (computerOrHuman == 1) {
			while ((initialNumSticks > 0) && (numSticksRemaining >= 0)) {

				int numSticksPicked = ap.nextInt("How many sticks do you want to remove now? Either 1 stick or 2 sticks are possible options");
				if (numSticksRemaining == 1) {
					while (numSticksPicked > 1){
						numSticksPicked = ap.nextInt("Error!! How many sticks do you want to remove now? Either 1 stick or 2 sticks are possible options");
					}
					if (numSticksPicked == 1) {
						System.out.print("Round " + roundNumber + ", " + initialNumSticks );

						initialNumSticks = initialNumSticks - 1;	
						numSticksRemaining = initialNumSticks;
						System.out.println(" sticks at start, human took 1, so " + numSticksRemaining + " sticks remain " );
						roundNumber++;
					}
					if (numSticksPicked == 2) {
						if (numSticksRemaining >= 2) {
							System.out.print("Round " + roundNumber + ", " + initialNumSticks );
							initialNumSticks = initialNumSticks - 2;
							numSticksRemaining = initialNumSticks;
							System.out.println(" sticks at start, human took 2, so " + numSticksRemaining + " sticks remain " );
							roundNumber++;
						}
					}
				}
				else {
					while (numSticksPicked >2){
						numSticksPicked = ap.nextInt("Error!! How many sticks do you want to remove now? Either 1 stick or 2 sticks are possible options");
					}
					if (numSticksPicked == 1) {
						System.out.print("Round " + roundNumber + ", " + initialNumSticks );

						initialNumSticks = initialNumSticks - 1;	
						numSticksRemaining = initialNumSticks;
						System.out.println(" sticks at start, human took 1, so " + numSticksRemaining + " sticks remain " );
						roundNumber++;
					}
					if (numSticksPicked == 2) {
						if (numSticksRemaining >= 2) {
							System.out.print("Round " + roundNumber + ", " + initialNumSticks );
							initialNumSticks = initialNumSticks - 2;
							numSticksRemaining = initialNumSticks;
							System.out.println(" sticks at start, human took 2, so " + numSticksRemaining + " sticks remain " );
							roundNumber++;
						}
					}
				}
				if (initialNumSticks == 0) {
					System.out.println("Human wins ");
				}
				//
				else {
					if (numSticksRemaining > 0) {
						if (( numSticksRemaining < 2 ) && ( numSticksRemaining != 0)) {
							System.out.print("Round " + roundNumber + ", " + initialNumSticks );
							initialNumSticks = initialNumSticks - 1;
							numSticksRemaining = initialNumSticks;
							System.out.println(" sticks at start, computer took 1, so " + numSticksRemaining + " sticks remain " );
							roundNumber++;
						}
						else {
							if (Math.random() < 0.5) {
								System.out.print("Round " + roundNumber + ", " + initialNumSticks );

								initialNumSticks = initialNumSticks - 1;	
								numSticksRemaining = initialNumSticks;
								System.out.println(" sticks at start, computer took  1, so " + numSticksRemaining + " sticks remain " );
								roundNumber++;
							}
							else {
								if ( numSticksRemaining >= 2);
								System.out.print("Round " + roundNumber + ", " + initialNumSticks );
								initialNumSticks = initialNumSticks - 2;
								numSticksRemaining = initialNumSticks;
								System.out.println(" sticks at start, computer took 2, so " + numSticksRemaining + " sticks remain " );
								roundNumber++;
							}
						}
						if (initialNumSticks == 0) {
							System.out.println("Computer wins ");
						}
					}
				}
			}
		}
		//
		if (computerOrHuman == 2) {
			while ((initialNumSticks > 0) && (numSticksRemaining >= 0)) {

				if (( numSticksRemaining < 2 ) && ( numSticksRemaining != 0)) {
					System.out.print("Round " + roundNumber + ", " + initialNumSticks );
					initialNumSticks = initialNumSticks - 1;
					numSticksRemaining = initialNumSticks;
					System.out.println(" sticks at start, computer took 1, so " + numSticksRemaining + " sticks remain " );
					roundNumber++;
				}
				else {
					if (Math.random() < 0.5) {
						System.out.print("Round " + roundNumber + ", " + initialNumSticks );
						initialNumSticks = initialNumSticks - 1;	
						numSticksRemaining = initialNumSticks;
						System.out.println(" sticks at start, computer took  1, so " + numSticksRemaining + " sticks remain " );
						roundNumber++;
					}
					else {
						System.out.print("Round " + roundNumber + ", " + initialNumSticks );
						initialNumSticks = initialNumSticks - 2;
						numSticksRemaining = initialNumSticks;
						System.out.println(" sticks at start, computer took 2, so " + numSticksRemaining + " sticks remain " );
						roundNumber++;
					}
				}
				if (initialNumSticks == 0) {
					System.out.println("Computer wins ");
				}
				else {
					int numSticksPicked = ap.nextInt("How many sticks do you want to remove now? Either 1 stick or 2 sticks are possible options");
					if (numSticksRemaining == 1) {
						while (numSticksPicked > 1){
							numSticksPicked = ap.nextInt("Error !! How many sticks do you want to remove now? Either 1 stick or 2 sticks are possible options");
						}
						if (numSticksPicked == 1) {
							System.out.print("Round " + roundNumber + ", " + initialNumSticks );

							initialNumSticks = initialNumSticks - 1;	
							numSticksRemaining = initialNumSticks;
							System.out.println(" sticks at start, human took 1, so " + numSticksRemaining + " sticks remain " );
							roundNumber++;
						}
						//
						if (numSticksPicked == 2) {
							if (numSticksRemaining >= 2) {
								System.out.print("Round " + roundNumber + ", " + initialNumSticks );
								initialNumSticks = initialNumSticks - 2;
								numSticksRemaining = initialNumSticks;
								System.out.println(" sticks at start, human took 2, so " + numSticksRemaining + " sticks remain " );
								roundNumber++;
							}
						}
					}
					else {
						while (numSticksPicked >2){
							numSticksPicked = ap.nextInt("Error!! How many sticks do you want to remove now? Either 1 stick or 2 sticks are possible options");
						}
						if (numSticksPicked == 1) {
							System.out.print("Round " + roundNumber + ", " + initialNumSticks );

							initialNumSticks = initialNumSticks - 1;	
							numSticksRemaining = initialNumSticks;
							System.out.println(" sticks at start, human took 1, so " + numSticksRemaining + " sticks remain " );
							roundNumber++;
						}
						//
						if (numSticksPicked == 2) {
							if (numSticksRemaining >= 2) {
								System.out.print("Round " + roundNumber + ", " + initialNumSticks );
								initialNumSticks = initialNumSticks - 2;
								numSticksRemaining = initialNumSticks;
								System.out.println(" sticks at start, human took 2, so " + numSticksRemaining + " sticks remain " );
								roundNumber++;
							}
						}
					}
					if (initialNumSticks == 0) {
						System.out.println("Human wins ");
					}
				}
			}
		}
		//

	}
}






