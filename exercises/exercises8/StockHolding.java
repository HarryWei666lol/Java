package exercises8;

import java.util.HashSet;
import java.util.Set;

public class StockHolding implements Valuable {
	private final String code;
	private final String owner;
	private int numShares;
	private double pricePerShare;


	public StockHolding(String code, String owner, double pricePerShare) {

		this.code = code;
		this.owner = owner;
		this.numShares = 0;
		this.pricePerShare = pricePerShare; // initially
	}

	// equals and hashCode
	// equals -- enduring: if we look now and later, the object ought to .equal itself

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockHolding other = (StockHolding) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	@Override
	public int getLiquidValue() {
		return this.getCurrentValue();
	}



	public int getCurrentValue() {
		return (int)(this.getNumShares() * this.getPricePerShare());
	}

	public String getCode() {
		return code;
	}

	public String getOwner() {
		return owner;
	}

	public int getNumShares() {
		return numShares;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}


	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}


	@Override
	public String toString() {
		return "StockHolding [code=" + code + ", owner=" + owner + ", numShares=" + numShares + ", pricePerShare="
				+ pricePerShare + "]";
	}

	public static void main(String[] args) {
		Set<StockHolding> set = new HashSet<StockHolding>();
		StockHolding s1 = new StockHolding("IBM", "Ron", 10);
		s1.setNumShares(100);
		set.add(s1);
		s1.setNumShares(200);
		set.add(s1);
		System.out.println(set);
		StockHolding s2 = new StockHolding("IBM", "Jane", 3);
		set.add(s2);
		System.out.println(set);

	}
}

