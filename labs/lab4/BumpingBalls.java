package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many balls do you want to use? ");
		int R = ap.nextInt("How many iterations do you want to have? ");

		double []positionX = new double[N];
		double []positionY = new double[N];
		double []velocityX = new double[N];
		double []velocityY = new double[N];
		Color [] colors = new Color [N];
		for( int i = 0; i < N; i++) {			
				positionX[i] = Math.random();
				positionY[i] = Math.random();
				velocityX[i] = Math.random() / 50 + 0.001;
				velocityY[i] = Math.random() / 50 + 0.001;
			}
		for ( int k = 0; k < N; k++)  {
			double a= Math.random();
			if( a < 1.0 / 6.0) {
				colors[k]= StdDraw.CYAN;
			}
			else if( a < 2.0 / 6.0) {
				colors[k]= StdDraw.GREEN;
			}
			else if( a < 3.0 / 6.0) {
				colors[k]= StdDraw.BLUE;
			}
			else if( a < 4.0 / 6.0) {
				colors[k]= StdDraw.MAGENTA;
			}
			else if( a < 5.0 / 6.0) {
				colors[k]= StdDraw.RED;
			}
			else {
				colors[k]= StdDraw.BLACK;
			}
		}
		for ( int i = 0; i < R; i++) {
			StdDraw.clear();
			int k = 0;
			for (  k = 0; k < N; k++)  {
				StdDraw.setPenColor(colors[k]);
				StdDraw.filledCircle(positionX[k], positionY[k], 0.025);
			}
			//StdDraw.pause(150);
			for(int z =0; z < N; z++) {
				for ( int l = z + 1; l < N; l++) {
					double d = Math.sqrt(Math.pow((positionX[l]-positionX[z]), 2) + Math.pow((positionY[l]-positionY[z]), 2));
					if (d <=0.025*2) {
						velocityX[l] = velocityX[l] / (-1.0);
						velocityY[l] = velocityY[l] / (-1.0);
						velocityX[z] = velocityX[z] / (-1.0);
						velocityY[z] = velocityX[z] / (-1.0);
					}
				}
				for( k =0; k < N; k++) {
					if ( positionX[k] <= 0) {
						velocityX[k]= Math.abs(velocityX[k]);
					}
					if ( positionX[k] >= 1) {
						velocityX[k]= (-1.0) * Math.abs(velocityX[k]);
					}
					if ( positionY[k] <= 0) {
						velocityY[k]= Math.abs(velocityY[k]);
					}
					if ( positionY[k] >= 1) {
						velocityY[k]= (-1.0) * Math.abs(velocityY[k]);
					}	
				}
			}
			//StdDraw.pause(80);
			for(int n = 0; n < N; n++) {
				positionX[n] = positionX[n] +velocityX[n];
				positionY[n] = positionY[n] +velocityY[n];
			}
			StdDraw.show(50);
		}

	}



}



