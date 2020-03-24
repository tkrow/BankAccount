
public class AddingTransactionsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount myBankAccount = new BankAccount();
		
		// Add a transaction to myBankAccount
		myBankAccount.getTransactions().add(new Transaction());
		
		// Set the amount for the first transaction:
		myBankAccount.getTransactions().get(0).setAmount(12.34);
		
		// Output value of first transaction:
		double firstTransactionAmount = myBankAccount.getTransactions().get(0).getAmount();
		
		System.out.println("firstTransactionAmount: " + firstTransactionAmount);
		
		
		// Add a second transaction
		myBankAccount.getTransactions().add(new Transaction());
		// set its value (ideally would be done in a constructor that took the value):
		myBankAccount.getTransactions().get(1).setAmount(34.56);
		
		
		//Total and display balance:
		myBankAccount.getTotalBalanceFromTransactions();
		System.out.println("myBankAccount.getBalance(): " + myBankAccount.getBalance());
	}

}
