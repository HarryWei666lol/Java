package exercises2;

import cse131.ArgsProcessor;

public class BadSwap {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int x = ap.nextInt("Enter x");
		int y = ap.nextInt("Enter y");
		
		if (x > y) {
			x = y;     // Bad
			y = x;     // swap!!
		}
		
		System.out.println("x and y are now "
				+ x + " and " + y);
		
		//
		// Student fill in with comments below this line:
		//   Why does the code above *not* swap the values of
		//      x and y?
		//   Note that the bad swap executes only if x>y
		//
		// Your answer: The line of code: y=x clobbers y value, making it equal to x value. Hence, a way to counter this problem is to assign y to be t before the code, y=x, that is add the code " int t=y " in place of "y=x" and change the last line of code, "y=x" into "x=t"
		//
		//
		//
		//
		//
		//

	}

}
