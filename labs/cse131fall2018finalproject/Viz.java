package cse131fall2018finalproject;

import java.awt.Color;
import java.awt.Font;

import sedgewick.StdDraw;

public class Viz {
	public static void display(String letter, double x, double y, boolean color) {
//		StdDraw.setXscale(-1.0, 1.0);
//		StdDraw.setYscale(-1.0, 1.5);       
//		StdDraw.setPenColor(Color.ORANGE);
//		StdDraw.filledRectangle(0, 1.25, 1, 0.25);
//		StdDraw.setPenColor(Color.BLACK);
//		Font font = new Font("Arial", Font.BOLD, 60);
//		StdDraw.setFont(font);
//		StdDraw.text(0, 1.25,message);	
		
		StdDraw.setPenRadius(0.05);
			
		StdDraw.setPenColor(Color.YELLOW);
		
		StdDraw.filledRectangle(x, y, 0.25, 0.25);
		if (color == false) StdDraw.setPenColor(Color.BLACK);
		if (color == true) StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.01);
		StdDraw.text(x, y, letter);	
	}
	
	public static void WUggleVizMessage(String message) {
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledRectangle(0, 1.25, 1, 0.25);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0, 1.25,message);
	}
	
	public static void WUggleCreateCanvas() {
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.5);
	}
	
//	public static void WUggleBoard (String[][] grid, boolean[][] color) {
//		double x = -0.75;
//		double y = 0.75;
//		for (int i = 0; i < 4; ++i) {
//			for (int j = 0; j <4; ++j) {
//				display(grid[i][j], x, y, color[0][0]);
//				x += 0.5;
//			}
//			x = -0.75;
//			y -= 0.5;
//		}
//	}

}