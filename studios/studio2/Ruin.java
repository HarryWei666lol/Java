package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int startAmount = ap.nextInt("Enter the amount of money that you start with ");
		double winChance = ap.nextDouble("Enter the probability that you win a gamble ");
		int winAmount = ap.nextInt("Enter the amount of money at which you reach to win the gamble ");
		int totalPlays = ap.nextInt(" Enter the number of times you simulate the problem ");
		double lossChance = (1 - winChance);
		double expectedRuin = 0;


		if (lossChance != winChance) {
			expectedRuin = (Math.pow((lossChance/winChance), startAmount) - Math.pow((lossChance/winChance), winAmount)) / (1 - Math.pow((lossChance/winChance), winAmount)); 
		}
		if (lossChance == winChance) {
			expectedRuin = 1 - startAmount / winAmount;
		}

		int simulationNumber = 1;
		int roundNumber = 0;
		int currentMoney = startAmount;
		int numLosses = 0;
		while (simulationNumber <= totalPlays) {
			currentMoney = startAmount;
			roundNumber = 0;
			while ((currentMoney < winAmount) && (currentMoney > 0)) {
				if (Math.random() < winChance) {
					currentMoney++;
				}
				else {
					currentMoney--;
				}
				roundNumber++;
			}
			String winOrLose = (currentMoney == winAmount) ? "WIN" : "LOSE";
			numLosses = (currentMoney == 0) ? ++numLosses : numLosses;
			String roundOrRounds = (roundNumber == 1) ? "round" : "rounds";
			System.out.println("Simulation " + simulationNumber + ": " + roundNumber + " " + roundOrRounds + "            " + winOrLose );
			simulationNumber++;

		}
		System.out.println("\nLosses: " + numLosses + "  Simulations: " + totalPlays);
		double actualRuin = (numLosses != totalPlays) ? (double) numLosses / totalPlays : numLosses / totalPlays;
		System.out.println("Actual Ruin Rate: " + actualRuin + "  Expected Ruin Rate: " + expectedRuin);

	}
}
