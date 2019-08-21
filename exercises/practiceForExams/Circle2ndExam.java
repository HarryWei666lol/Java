package practiceForExams;

import sedgewick.StdDraw;

public class Circle2ndExam {
	public static void circles(double x, double y, double r) {
		if(r <= 0.01) {
			return;
		}
		StdDraw.circle(x, y, r);
		circles(x,y,0.9*r);
	}
	
	public static void main(String[]args) {
		circles(0.5,0.5,0.5);
	}

}
