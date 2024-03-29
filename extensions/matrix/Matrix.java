package matrix;


public class Matrix {

	private double[][] values;

	/**
	 * The Matrix is based on the supplied two-dimensional array of values.
	 * Be sure to make your own copy of the values, so that changes to the
	 *    array outside of this class do not affect your work.
	 * @param values
	 */

	public Matrix(double[][] in) {
		// FIXME -- make a copy of in

		this.values = new double [in.length][in[0].length];//the second thing gets the length of column array
		for (int r = 0; r < in.length; r++) {
			for (int c = 0; c < in[0].length; c++) {
				this.values[r][c] = in[r][c];
			}
		}


		//  this is not the same thing as writing:
		//  values = in
	}

	public double getValue(int row, int col) {
		return this.values[row][col];  // Do not change this!
	}

	public int getNumRows() {
		return values.length;  // Do not change!
	}

	public int getNumCols() {
		return values[0].length; // Do not change!
	}

	/**
	 * You must complete this method, or the equals(Object) test will always
	 *   return false. 
	 * Arrays one and two are considered
	 * equal if and only if:
	 *   1) They have the same shape (number of rows and columns agree)
	 *   2) The contents of the two arrays are the same, element by element
	 * @param one
	 * @param two
	 * @return true iff the arrays have the same shape and contents
	 */
	private static boolean arraysAreEqual(double[][] one, double[][] two) {
		//FIXME
		if (one.length != two.length || one[0].length != two[0].length) {
			return false;
		}
		else {
			for (int r = 0; r < one.length; r++) {
				for (int c = 0; c < one[0].length; c++) {
					if (one[r][c] != two[r][c]) {
						return false;
					}
				}
			}
		}
		return true;
	}


	/**
	 * This was generated initially by eclipse, but
	 *   eclipse does not know how to compare two-dimensional arrays.
	 *   We therefore call arraysAreEequal to do that job.
	 */
	public boolean equals(Object obj) {
		// If this and obj are the same object, they must be equal
		if (this == obj)
			return true;
		// If obj is null ("this" cannot be null), then they are not equal
		if (obj == null)
			return false;
		// If the two objects are not the same type, they are not equal
		if (getClass() != obj.getClass())
			return false;
		//
		// If we get here, we have two objects of the same type.
		// Calling your helper method to determine the arrays' equality.
		Matrix other = (Matrix) obj;
		return arraysAreEqual(this.values, other.values);
	}

	public Matrix plus(Matrix other) {
		//FIXME
		double[][] arr = new double[this.getNumRows()][this.getNumCols()];
		if (other.getNumCols() == this.getNumCols() && other.getNumRows() == this.getNumRows()) {
			for (int r = 0; r < this.getNumRows(); r++) {
				for (int c = 0; c < this.getNumCols(); c++) {
					arr[r][c] = this.getValue(r, c) + other.getValue(r, c);
				}
			}
			Matrix m = new Matrix(arr);
			return m;
		}
		else {
			throw new IllegalArgumentException();
		}
	}


	/**
	 * Returns a **new Matrix** that is the product of this and the other one.
	 * Does not change this Matrix at all.
	 * @param other
	 * @return
	 */
	public Matrix times(Matrix other) {
		//FIXME
		if (this.getNumCols() == other.getNumRows()) {
			double[][] arr = new double[this.getNumRows()][other.getNumCols()];
			for(int r = 0; r < this.getNumRows(); r++) {
				for (int c = 0; c < other.getNumCols(); c++) {
					for (int i = 0; i < this.getNumCols(); i++) {
						arr[r][c] = arr[r][c] + this.getValue(r, i) * other.getValue(i, c);
					}
				}
			}
			Matrix m = new Matrix(arr);
			return m;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Returns a **new Matrix** that is the transpose of this one.
	 * Does not change this Matrix at all.
	 * @return
	 */
	public Matrix transpose() {
		//FIXME
		int temp = this.getNumRows();
		int rows = this.getNumCols();
		int cols = temp;
		double[][] arr = new double[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				arr[r][c] = this.getValue(c, r);
			}
		}
		Matrix m = new Matrix(arr);
		return m;
	}

	/**
	 * Modifies this Matrix by scaling row i by the supplied factor.
	 * @param i the row to scale, where 0 is the top row
	 * @param factor the amount by which to scale each element of row i
	 */
	public void scaleRow(int i, double factor) {
		//FIXME
		if (i < this.getNumRows()) {
			for (int j = 0; j < this.getNumCols(); j++) {
				this.values[i][j] = this.getValue(i, j) * factor;
			}
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Modifies this matrix by adding row i to row j.  Row 0 is the top row.
	 * @param i
	 * @param j
	 */
	public void addRows(int i, int j) {
		//FIXME
		if (i < this.getNumRows() && j < this.getNumRows()) {
			for (int c = 0; c < this.getNumCols(); c++) {
				this.values[j][c] = this.getValue(i, c) + this.getValue(j, c);
			}
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Modifies the Matrix by exchanging row i with row j
	 * @param i
	 * @param j
	 */
	public void exchangeRows(int i, int j){
		//FIXME
		double[] temp = new double[this.getNumCols()];
		if (i < this.getNumRows() && j < this.getNumRows()) {
			for (int c = 0; c < this.getNumCols(); c++) {
				temp[c] = this.values[i][c];
				this.values[i][c] = this.values[j][c];
				this.values[j][c] = temp[c];// swaping 2 rows need to have a temporary variable(temp)
			} 
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * My gift to you.  This returns a String representation of
	 * the Matrix.  The contents of each row is separated by a tab (\t)
	 * so that columns (kind of) line up.  Each row is separated by a
	 * newline (\n) so that the output looks like a matrix.  The output
	 * of this method should <i>not</i> be used to compare matrices for
	 * equality:  use the .equals(Object) method instead!
	 */
	public String toString() {
		String ans = "";
		for (int i=0; i < values.length; ++i) {
			ans = ans + "\n";
			// Loop below assumes all rows have the same number of columns
			for (int j=0; j < values[0].length; ++j) {
				ans = ans + values[i][j] + "\t";
			}
		}
		return ans;
	}

}
