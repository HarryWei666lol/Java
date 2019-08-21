package methodizeit;

public class MethodizeIt {
	
	//Speed Limit Extension 1.1
	public static int totalFine (int speed, int speedLimit){
		int overSpeedLimit = speed - speedLimit;
		
		if( speed <= speedLimit ) {
			return 0;
		}
		else {
			if ( overSpeedLimit <= 10) {
				return 50;
			}
			else {
				int fine = (overSpeedLimit -10) * 10 + 50;
				return fine;
			}	
			
		}	
	}
	public static void main (String[] args) {
		System.out.println(totalFine(80, 60));
	}

}
