package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {
	// drawing white small triangles on a huge black triangle
	public static void triangles(double llx, double lly, double size) {
		if( size < 0.025) { // base case
			return;
		}
		StdDraw.setPenColor(Color.BLACK);// drawing the overall black triangle
		double[]x = {llx, llx+size/2, llx+size};
		double[]y = {lly, lly+size*(Math.sqrt(3.0/4)), lly};
		StdDraw.filledPolygon(x, y);
		
		
		StdDraw.setPenColor(Color.WHITE);//drawing the single white triangle in the middle of the overall black triangle
		double[]a = {llx+size/4, llx+0.75*size, llx+size/2};
		double[]b = { lly+(Math.sqrt(3)/4)*size,lly+(Math.sqrt(3)/4)*size,lly};
		StdDraw.filledPolygon(a, b);
		
		triangles(llx,lly, size/2); // lower left-hand smaller triangle
		triangles(llx+ size/2, lly, size/2);// lower right-hand smaller triangle
		triangles(llx+ size/4, lly+(Math.sqrt(3)/4)*size,size/2);// top middle smaller triangle
		
	}
	public static void main(String[] args) {
		StdDraw.show(10);
		triangles(0,0,1);
		StdDraw.show(10);
	}

}
