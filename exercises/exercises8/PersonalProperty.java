package exercises8;

public class PersonalProperty implements Valuable {
	
	private final int initialValue;
	private int yearsOld;
	

	public PersonalProperty(int initialValue) {
		
		this.initialValue = initialValue;
		this.yearsOld=0;
	}
	
	public int depreciatedValue() {
		// initial value * 0.80 raised to the yearsOld power
		return (int)(this.initialValue * Math.pow(0.80, yearsOld));
	}
	
	public void yearOlder() { // a way to age the personal property
		this.yearsOld = this.yearsOld + 1;
	}
	
	public String toString() {
		return "Initial value: " + this.initialValue + " current value" + this.depreciatedValue();
	}


	@Override
	public int getLiquidValue() {
		return this.depreciatedValue();
	
	}

}
