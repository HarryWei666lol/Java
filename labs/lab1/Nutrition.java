package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);

		String name = ap.nextString("What is the name of the food? ");
		double carbs = ap.nextDouble("What is the number of grams of the carbohydrates in this food? ");
		double fat = ap.nextDouble("What is the number of grams of fat in this food? ");
		double protein = ap.nextDouble("What is the number of grams of protein in this food? ");
		int statedCals = ap.nextInt("What is the number of calories stated on this food's label? ");
		double carbsCalories = ( carbs * 4 );
		double fatCalories = Math.round( fat * 9 *10 );
		double realFatCalories=(fatCalories / 10);
		double proteinCalories = ( protein * 4);
		double totalCalories =( carbsCalories + realFatCalories + proteinCalories );
		double unavailableCalories = Math.round((totalCalories- statedCals) * 10);
		double realUnavailableCalories =(unavailableCalories / 10);
		double fiber = ( realUnavailableCalories / 4 );
		double percentageOfCarbs = Math.round((carbsCalories / statedCals) * 1000);
		double realPercentageOfCarbs = ( percentageOfCarbs / 10.0);
		double percentageOfFat = Math.round((realFatCalories / statedCals) * 1000 );
		double realPercentageOfFat = ( percentageOfFat / 10.0 );
		double percentageOfProtein = Math.round((proteinCalories / statedCals) * 1000 );
		double realPercentageOfProtein = ( percentageOfProtein / 10.0);
		boolean lowCarbDiet = ( percentageOfCarbs <= 25 );
		boolean lowFatDiet = ( percentageOfFat <= 15);
		double heads =Math.random();
		heads = heads + Math.random();
		heads = heads + Math.random();
		heads = heads + Math.random();
		heads = heads + Math.random();
		heads = heads + Math.random();
		heads = heads + Math.random();
		heads = heads + Math.random();
		heads = heads + Math.random();
		heads = heads + Math.random();
		boolean coinFlip = (( heads / 10 ) < 0.5 );
		

		System.out.println("\n" + name + " has ");
		System.out.println("\t" + carbs + " grams of carbohydrates = " + carbsCalories + " Calories " );
		System.out.println( "\t" + fat + " grams of fat = " + realFatCalories +" Calories" );
		System.out.println("\t" + protein + " grams of protein = " + proteinCalories + " Calories");
		System.out.println("\n This food is said to have " + statedCals + " (available) Calories. ");
		System.out.println(" With " + realUnavailableCalories + " unavailable Calories, this food has " + fiber + " grams of fiber");
		System.out.println("\n Approximately");
		System.out.println( "\t" + realPercentageOfCarbs + "% of your food is carbohydrates");
		System.out.println("\t" + realPercentageOfFat + "% of your food is fat");
		System.out.println("\t" + realPercentageOfProtein + "% of your food is protein");
		System.out.println("\n" + "This food is acceptable for a low-carb diet? " + lowCarbDiet );
		System.out.println("This food is acceptable for a low-fat diet? " + lowFatDiet );
		System.out.println("By coin flip, you should eat this food? "+ coinFlip);
	}

}
