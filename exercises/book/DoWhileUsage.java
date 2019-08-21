package book;

public class DoWhileUsage { // similar to while loop but except that the first test of the boolean condition is omitted

	public static void main(String[] args) {
		double x,y;
		do {// always want to generate a point first
			x = 2.0*Math.random()-1.0;
			y = 2.0*Math.random()-1.0;
		}
		while(x*x + y*y > 1.0);// after being generated, then check its eligibility

	}

}
