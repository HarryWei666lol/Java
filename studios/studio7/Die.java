package studio7;

public class Die {

	private int numSides;
	private boolean isFair;
	
	/**
	 * Constructor
	 * @param numSides
	 * @param isFair
	 */
	public Die(int numSides, boolean isFair) {
		this.numSides = numSides;
		this.isFair = isFair;
	}

	/**
	 * Getter
	 * @return numSides
	 */
	public int getNumSides() {
		return numSides;
	}

	/**
	 * Setter
	 * @param numSides
	 */
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	/**
	 * Getter
	 * @return isFair
	 */
	public boolean getisFair() {
		return isFair;
	}
	
	/**
	 * Setter
	 * @param isFair
	 */
	public void setIsFair(boolean isFair) {
		this.isFair = isFair;
	}

	/**
	 * Method
	 * @return die value
	 */
	public int throwDie() {
		if (isFair == true) {//(from 0-5)+1
			return (int) (Math.random() * this.numSides) + 1;
		}
		else {
			if (Math.random() < 0.5) {
				return 1;
			}
			else {//{(from 0 to 4) +1}+1
				return (int) (Math.random() * (this.numSides-1)) + 2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die test = new Die(6, true);
		int j = 0;
		while (j < 10) {
			System.out.println(test.throwDie());
			j++;
		}
		System.out.println("––––––––––––");
		test.setIsFair(false);
		int k = 0;
		while (k < 10) {
			System.out.println(test.throwDie());
			k++;
		}
		
	}
	
	

}
