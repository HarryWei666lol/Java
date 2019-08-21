package cse131fall2018finalproject;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import cse131.ArgsProcessor;
import sedgewick.StdIn;

public class WUggle {

	private String[][] grid;

	private String[] dictionary;
	/**
	 * A WUggle game
	 * @param grid a 4x4 array of Strings.
	 * The string at row r, 0 <= r < 4 and column c, 0 <= c < 4
	 *   is stored at grid[r][c]
	 */
	public WUggle(String[][] grid) {
		// FIXME
		this.grid = grid;
	}

	public WUggle() {

	}

	/**
	 * 
	 * @param row the starting row of the String we seek
	 * @param col the starting column of the String we seek
	 * @param length the length of the String we seek
	 * @return the String of the supplied length that occurs in the grid horizontally, starting at the specified row and column
	 */
	public String horizontalWordAtRow(GridPos gp, int length) {
		String ans = "";
		for (int i = 0; i < length; ++i) {
			ans = ans + grid[gp.getRow()][gp.getCol()];
			gp = gp.rightNeighbor();
		}
		return ans; // FIXME
	}

	public String verticalWordAtColumn(GridPos gp, int length) {
		String ans = "";
		for (int i = 0; i < length; ++i) {
			ans = ans + grid[gp.getRow()][gp.getCol()];
			gp = gp.downNeighbor();

		}
		return ans; 
		// FIXME
	}



	public boolean dict (String word) {

		boolean exist = false;
		for (String d : dictionary) {				
			if (word.equals(d)) {
				exist = true;
			}
		}
		return exist;
	}

	//	public boolean FindCore(String str, int x, int y) 
	//    if (str.length == 0) {
	//        // reached the base of recursion since no more string is left to search
	//        // it also indicates that the grid are found
	//        return true;
	//    }
	//    for (int d = 0 to 3) [
	//        int new_x = x + dir[d][1];
	//        int new_y = y + dir[d][2];
	//        if (new_x is within the bound and new_y is within the bound && color[new_x][new_y] == false) {
	//            if (str.startWith(grid[new_x][new_y])) {
	//                color[new_x][new_y] = true;
	//                if (FindCore(str.substring(grid[new_x][new_y].length), new_x, new_y) == false) {
	//                    color[new_x][new_y] = false;
	//                } else {
	//                    return true;
	//                }
	//            }
	//        }
	//    ]    
	//    return false;

	public boolean find (String word, boolean[][] color){
		for (int i = 0; i < 4; ++i) {
			for (int j =0; j <4; ++j) {
				if (word.contains(this.grid[i][j])) { 
					color[i][j] = true;	
					int start = word.indexOf(this.grid[i][j]), end = this.grid[i][j].length() + start;
					if (findString(word.substring(0, start).concat(word.substring(end)), i , j, color)) {
						return true; 
					}
					color[i][j] = false;
				}
			}
		}	
		return false;	
	}
	public boolean findString(String word, int x, int y, boolean [][] color) {
		if (word.length() == 0) {
			return true;
		}
		int[][] direction = new int[4][2];
		direction[0][0] = 0;
		direction[0][1] = 1;
		direction[1][0] = 0;
		direction[1][1] = -1;
		direction[2][0] = -1;
		direction[2][1] = 0;
		direction[3][0] = 1;
		direction[3][1] = 0;

		for (int i = 0; i <4; ++i) {
			int newX = x + direction[i][0];
			int newY = y + direction[i][1];

			if ((newX >= 0) && (newX < 4) && (newY >= 0) && (newY < 4) && (color[newX][newY] == false)) {
				if (word.contains(this.grid[newX][newY])) {
					color [newX][newY] = true;
					int start = word.indexOf(this.grid[newX][newY]), end = this.grid[newX][newY].length() + start;
					if (findString(word.substring(0, start).concat(word.substring(end)), newX, newY, color) == false) {
						color [newX][newY] = false;
					}
					else return true;
				}
			}		

		}

		return false;
	}

	public void WUggleBoard (boolean[][] color) {
		double x = -0.75;
		double y = 0.75;
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j <4; ++j) {
				Viz.display(this.grid[i][j], x, y, color[i][j]);
				x += 0.5;
			}
			x = -0.75;
			y -= 0.5;
		}
	}







	public static void main(String[] args) {
		String[][] grid = new String[4][4];
		grid[0][0] = Dice.die00[(int)(6*Math.random())];
		grid[0][1] = Dice.die01[(int)(6*Math.random())];
		grid[0][2] = Dice.die02[(int)(6*Math.random())];
		grid[0][3] = Dice.die03[(int)(6*Math.random())];
		grid[1][0] = Dice.die04[(int)(6*Math.random())];
		grid[1][1] = Dice.die05[(int)(6*Math.random())];
		grid[1][2] = Dice.die06[(int)(6*Math.random())];
		grid[1][3] = Dice.die07[(int)(6*Math.random())];
		grid[2][0] = Dice.die08[(int)(6*Math.random())];
		grid[2][1] = Dice.die09[(int)(6*Math.random())];
		grid[2][2] = Dice.die10[(int)(6*Math.random())];
		grid[2][3] = Dice.die11[(int)(6*Math.random())];
		grid[3][0] = Dice.die12[(int)(6*Math.random())];
		grid[3][1] = Dice.die13[(int)(6*Math.random())];
		grid[3][2] = Dice.die14[(int)(6*Math.random())];
		grid[3][3] = Dice.die15[(int)(6*Math.random())];

		boolean color[][] = new boolean[4][4];
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4; ++j) {
				color [i][j] =  false;
			}
		}

		WUggle game = new WUggle(grid);
		ArgsProcessor.changeStdIn("datafiles/dictionary/shortWords.txt");
		game.dictionary = StdIn.readStrings();


		ArgsProcessor ap = new ArgsProcessor(args);
		//		ArgsProcessor.changeStdIn("datafiles/dictionary/shortWords.txt");
		//		String[] dictionary = StdIn.readStrings();
		//		game.WUggleViz("Enter a word");
		Viz.WUggleCreateCanvas();
		Viz.WUggleVizMessage("Enter a word");
		game.WUggleBoard(color);

		while (true) {

			String word = ap.nextString("Enter your word").toUpperCase();

			//			boolean exist = false;
			//			for (String d : dictionary) {				
			//				if (word == d) {
			//					exist = true;
			//				}
			//			}
			System.out.println(word);
			boolean exist = game.dict(word.toLowerCase());
			for (int i = 0; i < 4; ++i) {
				for (int j = 0; j < 4; ++j) {
					color [i][j] =  false;
				}
			}
			if (exist == false) {
				Viz.WUggleVizMessage("not a word");
				game.WUggleBoard(color);
			}
			if (exist == true) {
				if (game.find(word, color)) {
					Viz.WUggleVizMessage("Found: " + word);
					game.WUggleBoard(color);
				}

				else {
					Viz.WUggleVizMessage("Not Found: " + word);
				}
				//			}
			}
		}
	}
	}