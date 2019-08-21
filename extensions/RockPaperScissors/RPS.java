package RockPaperScissors;

import cse131.ArgsProcessor;

public class RPS {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int totalRounds = ap.nextInt("Set the total number of rounds ");
		int roundNumber = 0;
		int humanNumWins = 0;
		int computerNumWins = 0;

		while (roundNumber < totalRounds) {
			double t = Math.random();
			if( t < 1.0 / 3.0) {
				roundNumber++;
				int rockOrPaperOrScissors = ap.nextInt("1 for rock, 2 for paper, 3 for scissors ");
				while (rockOrPaperOrScissors > 3) {
					rockOrPaperOrScissors = ap.nextInt("Error!! Re-type :1 for rock, 2 for paper, 3 for scissors ");
				}
				if( rockOrPaperOrScissors == 1) {
					System.out.println("Round " + roundNumber + ": Computer used Scissors; human used Rock. Human wins");
					humanNumWins++;
				}
				if( rockOrPaperOrScissors == 2) {
					System.out.println("Round " + roundNumber + ": Computer used Scissors; human used Paper. Computer wins");
					computerNumWins++;
				}
				if( rockOrPaperOrScissors == 3) {
					System.out.println("Round " + roundNumber + ": Computer used Scissors; human used Scissors. Draw");
				}	
			}
			else if ( t < 2.0 / 3.0) {
				roundNumber++;
				int rockOrPaperOrScissors = ap.nextInt("1 for rock, 2 for paper, 3 for scissors ");
				while (rockOrPaperOrScissors > 3) {
					rockOrPaperOrScissors = ap.nextInt("Error!! Re-type :1 for rock, 2 for paper, 3 for scissors ");
				}
				if( rockOrPaperOrScissors == 1) {
					System.out.println("Round " + roundNumber + ": Computer used Paper; human used Rock. Computer wins");
					computerNumWins++;
				}
				if( rockOrPaperOrScissors == 2) {
					System.out.println("Round " + roundNumber + ": Computer used Paper; human used Paper. Draw");

				}
				if( rockOrPaperOrScissors == 3) {
					System.out.println("Round " + roundNumber + ": Computer used Paper; human used Scissors. Human wins");
					humanNumWins++;
				}	
			}
			else {
				roundNumber++;
				int rockOrPaperOrScissors = ap.nextInt("1 for rock, 2 for paper, 3 for scissors ");
				while (rockOrPaperOrScissors > 3) {
					rockOrPaperOrScissors = ap.nextInt("Error!! Re-type :1 for rock, 2 for paper, 3 for scissors ");
				}
				if( rockOrPaperOrScissors == 1) {
					System.out.println("Round " + roundNumber + ": Computer used Rock; human used Rock. Draw");
				}
				if( rockOrPaperOrScissors == 2) {
					System.out.println("Round " + roundNumber + ": Computer used Rock; human used Paper. Human wins");
					humanNumWins++;
				}
				if( rockOrPaperOrScissors == 3) {
					System.out.println("Round " + roundNumber + ": Computer used Rock; human used Scissors. Computer wins");
					computerNumWins++;
				}	
			}

		}
		double humanWinPercentage = Math.round(humanNumWins * 1.0 / (totalRounds * 1.0) * 1000);
		double actualHumanWinPercentage = humanWinPercentage / 10;
		double computerWinPercentage = Math.round(computerNumWins* 1.0 / (totalRounds * 1.0) * 1000);
		double actualComputerWinPercentage = computerWinPercentage / 10;
		System.out.println("Human win percentage: " + actualHumanWinPercentage + "%");
		System.out.println("Computer win percentage: " + actualComputerWinPercentage + "%");


	}

}
