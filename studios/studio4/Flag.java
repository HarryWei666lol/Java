package studio4;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	
	public static void main(String[] args) {
		//
		//  Add code for your studio below here.
		//
		StdDraw.setPenRadius(0.01);
		//StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.square(0.5, 0.5, 0.5);
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledEllipse(0.5, 0.5, 0.45, 0.3);
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledSquare(0.5, 0.5, 0.2);
		StdDraw.setPenColor(Color.GREEN);
		
		// drawing the triangle
		double[]xCoords = {0.35, 0.65, 0.5};
		double[]yCoords = {0.4, 0.4, 0.65};
		StdDraw.filledPolygon(xCoords, yCoords);
		StdDraw.setPenColor(Color.BLACK);
		//StdDraw.text(0.5, 0.5, "CSisFun");
		
		for (double i= 0.1; i <= 0.9; i=i+0.1 ) {
			//to draw text iteratively
			StdDraw.text(i, 1-i, "CSisFun");
			StdDraw.show(400);// to make CSisFun appear with a time interval of 400 milliseconds
		}
		
			try {
				System.setIn(new FileInputStream("music/Ascale.txt"));
			} catch (FileNotFoundException e) {
			
				e.printStackTrace();
			}

	        // repeat as long as there are more integers to read in
	        while (!StdIn.isEmpty()) {

	            // read in the pitch, where 0 = Concert A (A4)
	            int pitch = StdIn.readInt();
	            
	            // read in duration in seconds
	            double duration = StdIn.readDouble();
	            
	            // build sine wave with desired frequency
	            double hz = 440 * Math.pow(2, pitch / 12.0);
	            int N = (int) (StdAudio.SAMPLE_RATE * duration);
	            double[] a = new double[N+1];
	            for (int i = 0; i <= N; i++) {
	                a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
	            }
	            // play it using standard audio
	            StdAudio.play(a);
	        }
	}

}
