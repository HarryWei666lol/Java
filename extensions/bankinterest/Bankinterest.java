package bankinterest;

import cse131.ArgsProcessor;

public class Bankinterest {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		System.out.println("Day       Type         Amount     Balance");
		int day = 0;
		double balance = 4000.00;
		double amountChanged = 0.0;
		while( day <= 29 ){
			double currentMoney = balance;
			if(Math.random() < 0.5) {
				amountChanged = 200.50 ;
				
				balance = currentMoney + 200.50;
				day++;
				if ( day < 10) {
					System.out.println( day + "         Deposit     $" + amountChanged +"0      $" + balance + "0" );
				}
				if (( day >= 10) && ( day <=30 )){
					System.out.println( day + "        Deposit     $" + amountChanged +"0      $" + balance + "0" );
				}
			}
			else {

				amountChanged = 100.00 ;
				balance = currentMoney - 100.00;
				day++;
				if ( day < 10) {
					System.out.println( day + "         Withdraw    $" + amountChanged +"0      $" + balance + "0" );
				}
				if (( day >= 10) && ( day <=30 )){
					System.out.println( day + "        Withdraw    $" + amountChanged +"0      $" + balance + "0" );
				}		
			}
		}
		double interest = balance * 0.02;
		System.out.println("Interest earned:  $" + interest);
		double total = interest + balance;
		System.out.println(" Money after one month's interest:   $" + total);



	}

}

