package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int initialPennies= ap.nextInt("Starting number of pennies?");
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
		
		int dollars= initialPennies / 100;
		int penniesLeftAfterDollars = initialPennies % 100;
		int quarters = penniesLeftAfterDollars / 25;
		int afterQuartersChange = penniesLeftAfterDollars % 25;
		int dimes = afterQuartersChange / 10;
		int afterDimesChange = afterQuartersChange % 10;
		int nickles = afterDimesChange / 5;
		int pennies = afterDimesChange % 5;
				
		System.out.println("You have "+ dollars +  " dollars");
		System.out.println("Pennies left " + penniesLeftAfterDollars);
		System.out.println(" and "+ quarters + " quarters");
		System.out.println(" change is now " + afterQuartersChange);
		System.out.println(" and " + dimes + " dimes");
		System.out.println(" change is now " + afterDimesChange);
		System.out.println(" and " + nickles + " nickles ");
		System.out.println(" and " + pennies + " pennies ");
		
		int check = 100 * dollars + 25 * quarters + 10 * dimes + 5 * nickles + pennies;
		System.out.println(" check is " + check);
	}

}
