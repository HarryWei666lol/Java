package baseball;

import cse131.ArgsProcessor;

public class BaseballStats {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("Enter the name of the baseball player ");
		int atBats = ap. nextInt(" Enter the number of atBats done by the player ");
		int hits = ap.nextInt(" Enter the number of hits done by the player ");
		double battingAverage = Math.round((hits * 1.0 / atBats ) * 1000);
		double realBattingAverage = battingAverage / 1000;
		
		boolean allStarWorthy = ( realBattingAverage > 0.270);
		
		System.out.println( name + " " + realBattingAverage);
		System.out.println("All-Star Worthy? " + allStarWorthy );
		
	

	}

}
