package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How much history?");
		
		StdDraw.setPenColor(Color.CYAN);
		// let's keep a history of where the mouse has been
		double[] histX = new double[N];
		double[] histY = new double[N];
		
		int cur = 0;
		while (true) {
			StdDraw.clear();
			// do our thing
			//
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			// cur is where the current values go for x and y
			histX[cur] = x;
			histY[cur] = y;
			cur = cur + 1;
			// reset to 0 if we have used up the whole array
			if (cur >= histX.length) {
				cur = 0;
				
			}
			StdDraw.filledCircle(histX[cur], histY[cur], 0.05);

		
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
		}

	}

}
