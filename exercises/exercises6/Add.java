package exercises6;

public class Add {

	//
	// Complete using the formula:
	//   add(x,y) =           x , if y == 0
	//   add(x,y) = add(x+1,y-1), otherwise
	
	// require:  y>=0
	public static int addHelper(int x, int y) {
		if (y==0) {
			// base case
			return x; 
		}
		else {
			return addHelper(x+1,y-1);
		}
	}

	//
	// Answer in comments below:
	//
	//  For what values of x and y does your method operate correctly?
	//
	//  Your answer: when the y-value is equal to or greater than 0.
	//
	//  Complete the following method
	//   so that it calls add but returns the correct answer
	//   for any x and y?
	//  As a hint, consider that  (x+y) = -(-x + -y)
	
	// must work all the time
	public static int add(int x, int y) {
		if (y < 0) {
			if (x < 0) { // x is also negative?
				return -addHelper(-x,-y);
			}
			else { // x >= 0
				return addHelper(y, x);	
			}	
		}
		else {
			return addHelper(x,y);
		}
	}


}
