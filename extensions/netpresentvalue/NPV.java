package netpresentvalue;

public class NPV {
	
	/**
	 * How much will the specified number of dollars be worth at the
	 * end of the specified time using interest rate r?
	 * @param dollars initial investment
	 * @param years time period of accumulation
	 * @param r The interest rate, computed at the end of each year
	 * @return the future value of the investment
	 */
	public static double futureValue(double dollars, int years, double r) {
		double futureValue = dollars * (Math.pow((1.0+r), years));
		return futureValue;
		
	}

	/**
	 * Given the specified number of dollars some years from now,
	 * how much are those dollars worth presently using the specified
	 * discount rate?
	 * @param dollars amount of money available in the future
	 * @param years number of years in the future
	 * @param r the discount rate, computed annually
	 * @return the present value of the future money
	 */
	public static double presentValue(double dollars, int years, double r) {
		double presentValue = dollars / (Math.pow((1.0+r), years));
		return presentValue;
	}
	
	/**
	 * Compute the net present value of an investment as described on
	 *   the web page for this assignment.
	 * @param investment the money placed into the investment in year 0, never returned
	 * @param years the number of payouts
	 * @param payout the amount of the payout, paid at the end of years 1, 2, ...
	 * @param r the discount rate of money per year
	 * @return the net present value after all payouts are made
	 */
	public static double netPresentValue(double investment, int years, double payout, double r) { 
		double sum = 0;
		for(int i =1; i <= years; i++) {
			sum = sum + presentValue(payout, i ,r);
		}
		double netPresentValue = sum - investment;
		return netPresentValue;
		
	}
	
	public static void main(String[] args) {
		System.out.println(netPresentValue(100000, 12, 10000, 0.1));
	}
	
}
