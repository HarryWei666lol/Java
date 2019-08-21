package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("What is N? ");
		System.out.println("      Column");
		System.out.print("      ");
		for (int c =0; c<N; c++) {
			System.out.print(c + "  ");
		}
		System.out.println();
		System.out.println("row");

		int [][]array = new int [N][N];

		for ( int r = 0; r<N; r++) {
			System.out.print(r + "     ");
			for ( int c = 0; c< N; c++) {
				if (c==0) {
					array[r][c]=1;
				}
				else if (c > r) {
					array[r][c]=0;
				}
				else if (c ==r) {
					array[r][c]=1;
				}
				else {
					array[r][c] = array[r-1][c] + array[r-1][c-1];
				}
				if ( array[r][c]!=0) {
					if (array [r][c] < 10) {
						System.out.print(array[r][c] + "  ");
					}
					else {
						System.out.print(array[r][c] + " ");
					}

				}
			}
			System.out.println();
		}

	}
}
