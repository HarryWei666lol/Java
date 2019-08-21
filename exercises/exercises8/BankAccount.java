package exercises8;

public class BankAccount implements Valuable{
	// Instance Variables
	private int balance;
	
    // The constructor
	//   It has no return type
	//   It has the same name as the class
	public BankAccount(int balance) {
	
		this.balance = balance;
	}
	
    // An accessor / getter, returns the value of balance
	public int getBalance() {
		return balance;
	}
	
	// A mutator, changes the value of balance
	public void deposit(int funds) {
		this.balance = this.balance + funds;
		this.balance = this.balance - 1;  // fee for deposit
	}
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	@Override
	public int getLiquidValue() {
		return this.getBalance();
	}


	
	

}
