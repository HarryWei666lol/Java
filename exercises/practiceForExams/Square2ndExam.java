package practiceForExams;

import sedgewick.StdDraw;

public class Square2ndExam {
	public static void squares(double x, double y, double hw) {
		if(hw <=0) {
			return;
		}
		StdDraw.square(x, y, hw);
		//StdDraw.pause(500);
		squares(x, y, hw-0.03);
	}
	public static void main(String[] args) {
		StdDraw.show(10);
		squares(0.5, 0.5, 0.5);
		StdDraw.show(10);
	}


}
