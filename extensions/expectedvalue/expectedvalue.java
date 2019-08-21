package expectedvalue;

import cse131.ArgsProcessor;

public class expectedvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		double probOfGamerSucceed = ap.nextDouble("Enter the probability of the game start-up venture succeeding ");
		double expectedIncomeOfGamer= (probOfGamerSucceed * 190000 + (1-probOfGamerSucceed) * 5000 );
		boolean gamerOrProgrammer = (expectedIncomeOfGamer > 115000 );
		
		System.out.println("Gamer: $" + expectedIncomeOfGamer);
		System.out.println("Programmer: $115000 ");
		System.out.println("You should be a gamer and not a programmer? "+ gamerOrProgrammer);

	}

}
