package onerepmax;

import cse131.ArgsProcessor;

public class OneRepMax {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int w = ap.nextInt("What is your successful weight? ");
		int r = ap.nextInt("What is the number of your successful reps? ");
		while( r <= 1 ) {
			 r = ap.nextInt("Error!! What is the number of your successful reps? ");
		}
		while( r > 12 ) {
			 r = ap.nextInt("Error!! What is the number of your successful reps? ");
		}
		int desiredReps = ap.nextInt("What is the number of your desired reps? ");
	
		double oneRepMax = Math.round(w * ( 1.0 + r / 30.0));
		int actualOneRepMax = (int)(oneRepMax);
		double desiredOneRepMax = oneRepMax / ( 1.0 + desiredReps / 30.0);
		int actualDesiredOneRepMax = (int)(desiredOneRepMax);
		System.out.println("One-rep max: " + actualOneRepMax );
		System.out.println("Weight for " + desiredReps + " reps: " + actualDesiredOneRepMax );
		
		int percentageRM = 100;
	    while (percentageRM >= 55) {
			percentageRM = percentageRM - 5;
			double newW = w * ( 1.0 + r / 30.0) * percentageRM;
			int actualW = (int) newW / 100;
			int aactualW = (Math.round(actualW / 5)) * 5;
			System.out.println(percentageRM + "% 1 RM: "+ aactualW);
			
			
		}

			
			
		}
}
				

	

	


