package exercises8;

import java.util.LinkedList;
import java.util.List;

public class Person {
	private final List<Valuable> assets; // in between < > is the name of the interface
	
	public Person() {
		this.assets = new LinkedList<Valuable>();
	}
	
	public void addAsset(Valuable v) { // ?? add anything that implements Valuable
		assets.add(v);
	}

	public List<Valuable> getAssets(){ // ??
		return this.assets;
	}
	
	public int getWorth() {
		int sum = 0;
		for(Valuable v : assets) { // in the bracket is the name of the interface
			sum = sum + v.getLiquidValue();
		}
		return sum;
	}
	
	public static void main(String[] args) { // testing
		Person p = new Person();
		p.addAsset(new BankAccount(1000));
		//
		StockHolding s = new StockHolding("IBM", "Ron", 131);
		s.setNumShares(100);
		p.addAsset(s);
		//
		PersonalProperty pp = new PersonalProperty(100000);
		p.addAsset(pp);
		for(int i = 0; i < 10; ++i) {// age 10 years
			pp.yearOlder();
		}
		//
		System.out.println("Assets " + p.getAssets());// a list of different assets compiled 
		                                              //because of common interface Valuable
		System.out.println("Person is worth " + p.getWorth());// total worth after 10 years 
		//(the person is born after the property has aged for 10 years)
		pp.yearOlder();//after getting the worth after 10 years, get another worth after aging for 1 year
		System.out.println("Person is (1 yr older) worth " + p.getWorth());
	}

}
