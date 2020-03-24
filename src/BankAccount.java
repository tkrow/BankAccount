import java.util.ArrayList;

public class BankAccount {

	// Data Members
	private Person owner;
	private double balance;
	// list of transactions
	private ArrayList<Transaction> transactions;
	// Note: Address is part of Person

	//Constructors
	public BankAccount() {
		//Be sure to instantiate all subobjects / data member objects
		this.owner = new Person();
		this.setTransactions(new ArrayList<Transaction>());
	}
	
	// Get / Set
	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	//Member Methods
	
	// Total all transactions for this account
	public double getTotalBalanceFromTransactions() {
		
		//loop through and total
		//for (int i = 0; i < transactions.size(); i++) {
			
		//balance += transactions.get(i).getAmount();
			
		//}
		
		// forEach equivalent
		for(Transaction transaction : getTransactions() ) {
			
			balance += transactions.get().getAmount();
			
		}
		
		return balance;
	}
	
	
}
