package lab6;

public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
		// from here, call f or g with the appropriate parameters
		//
		System.out.println(f(87));
		System.out.println(g(1,2));

	}
	/**
	 * 
	 * @param x
	 * @return if x > 100, f(x) = x -10; else if x <= 100, f(x) = f(f(x+11))
	 */
	public static int f (int x) {
		if(x > 100) {
			return x-10;
		}
		else{
			return f(x+11);
		}

	
	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @return if x = 0, g(x,y) = y+1; else if x > 0 and y = 0, g(x,y) = g(x-1,1); else if x > 0 && y > 0, g(x,y) = g(x-1,g(x,y-1)) 
	 */
	public static int g ( int x, int y) {
		if (x == 0) {
			return y+1;
		}
		else if( x > 0 && y == 0) {
			return g(x-1,1);
		}
		else if( x > 0 && y > 0) {
			return g(x-1,g(x,y-1));
		}
		else {
			return 0;
		}
	}

}
