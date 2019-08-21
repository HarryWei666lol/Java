package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int speed = ap.nextInt("Enter your speed ");
		int speedLimit = ap.nextInt("Enter the speed limit ");
		int overSpeedLimit = ( speed - speedLimit );
		int initialFine = ((speed <= speedLimit) ? 0 : 50  );
		int additionalFinePerMile = ( (overSpeedLimit <= 10) ? 0 : 10 );
		int totalFine =( initialFine + additionalFinePerMile * ( overSpeedLimit - 10) );
		
		System.out.println("You reported a speed of " + speed + " MPH for a speed limit of " + speedLimit + " MPH ");
		System.out.println("You went " + overSpeedLimit + " MPH over the speed limit. ");
		System.out.println("Your fine is $" + totalFine + "." );
		
		
		
	
		
		
		
		

	}

}
