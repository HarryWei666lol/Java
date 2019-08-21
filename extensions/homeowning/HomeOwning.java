package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String nameApartment = ap.nextString(" Enter the name of the apartment complex ");
		int zipCode = ap.nextInt("Enter the zip code of the apartment ");
		int monthlyRent = ap.nextInt("Enter the monthly rent of the apartment ");
		double dailyInterest = ap.nextDouble (" Enter the daily interest payment for your mortgage on the house ");
		
		int yearlyRent = monthlyRent * 12;
		double weeklyRent = Math.round( yearlyRent / 52.0 * 100);
		double actualWeeklyRent = weeklyRent / 100;
		double yearlyInterest = Math.round(dailyInterest * 365 * 100);
		double actualYearlyInterest = yearlyInterest / 100;
		double weeklyInterest = Math.round( yearlyInterest / (365 / 7.0 ) );
		double actualWeeklyInterest = weeklyInterest / 100;
		String rentOrBuy =(actualWeeklyRent < actualWeeklyInterest) ? "I should rent " : "I should buy ";
		
		System.out.println( nameApartment + " is located in the Zip Code " + zipCode );
		System.out.println("Rent per year: " + yearlyRent );
		System.out.println("Rent per week: " + actualWeeklyRent + "\n" );
		System.out.println("Interest paid per year: " + actualYearlyInterest );
		System.out.println("Interest paid per week: " + actualWeeklyInterest +"\n"  );
		System.out.println( rentOrBuy );
		
		
		
		
		
	

	}

}
