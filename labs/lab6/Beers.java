package lab6;

import cse131.ArgsProcessor;

public class Beers {


	public static String bottleOfBeers (int n) {
		if( n == 0) {
			return "";
		}
		String s = n + " bottles of beer on the wall, "+ n+ " bottles of beer; you take one down, pass it around, "+ (n-1)+" bottles of beer on the wall.";
		s = s+"\n"+bottleOfBeers(n-1); // "\n" means starting in a new line
		return s;
	}
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("What is n? ");
		System.out.println(bottleOfBeers(n));
	}
}
