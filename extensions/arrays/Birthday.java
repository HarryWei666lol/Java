package arrays;
import cse131.ArgsProcessor;

public class Birthday {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many people is going to enter the room?");

		int birthday [][] = new int[12][31];
		int month = 0;
		int day = 0;

		// generate birthday for N people
		for( int i = 0; i < N; i++) {
			month= (int) (Math.random() * 12);
			day = (int)(Math.random()* 31);
			birthday[month][day]++;
		}

		// percentage of people born in each month
		double sameMonth[]= new double[12];
		for( int i = 0; i < 12; i++) {
			int number1 =0;
			for(int j = 0; j <31; j++) {
				number1 = number1 + birthday[i][j];
			}
			double percentagePplSameMonth = Math.round((double)number1 / N * 10000);
			double realPercentagePplSameMonth = percentagePplSameMonth / 100;
			System.out.println("The percentage of people born on the " + (i+1) + " month is " + realPercentagePplSameMonth + "%");
			sameMonth[i] = (double) number1 / N;
		}

		// average of the 12 values above
		double subtotal1 = 0;
		for ( int k = 0; k < 12; k++) {
			subtotal1 =subtotal1 + sameMonth[k];
		}
		double percentageOf12ValuesAbove = Math.round(subtotal1 / 12.0 * 10000);
		double realPercentageOf12ValuesAbove = percentageOf12ValuesAbove / 100;
		System.out.println("||The average of the 12 values computed above is " + realPercentageOf12ValuesAbove + "%");
		System.out.println();

		//percentage of people born on each numerical day
		double sameDay[]= new double [31];
		for (int i = 0; i < 31; i++) {
			int number2 =0;
			for( int j = 0; j < 12; j++) {
				number2 = number2 + birthday[j][i];	
			}
			double percentagePplSameDay = Math.round((double)number2 / N * 10000);
			double realPercentagePplSameDay = percentagePplSameDay / 100;
			System.out.println("The percentage of people born on the " + (i+1) + " day is " + realPercentagePplSameDay + "%");
			sameDay[i] = (double) number2 / N;
		}

		//average of the 31 values above
		double subtotal2 = 0;
		for ( int k = 0; k < 12; k++) {
			subtotal2 =subtotal2 + sameDay[k];
		}
		double percentageOf31ValuesAbove = Math.round(subtotal2 / 31.0 * 10000);
		double realPercentageOf31ValuesAbove = percentageOf31ValuesAbove / 100;
		System.out.println("||The average of the 12 values computed above is " + realPercentageOf31ValuesAbove + "%");
		System.out.println();

		//percentage of people born on the same day
		int number3 = 0;
		for(int i = 0; i < 12; i++){
			for ( int j = 0; j < 31; j++) {
				if (birthday[i][j] > 1) {
					number3 = number3 + birthday[i][j];
				}
			}
		}
		double percentageOfPplExactlySameDay = Math.round((double)number3 / N * 10000);
		double realPercentageOfPplExactlySameDay = percentageOfPplExactlySameDay / 100;
		System.out.println("Percentage of people born on exactly the same day is " + realPercentageOfPplExactlySameDay + "%");
	}

}

