package bankactivities;

public class onTransaction {
	
	public void deposit(Account acc,int amount) {
		
		
		if(amount < Bank.DEPOSIT_LIMIT && amount > 0) {
		int newBalance = acc.getBalance() +amount;
		acc.setBalance(newBalance);
		
		System.out.println("Balance Deposited");
		}else {
		System.out.println("Please enter valid diposit amount...");
		}
	}
	public void withdrow(Account acc,int amount) {
	
		if(amount < Bank.WITHDROW_LIMIT && amount > 0) {
		int newBalance = acc.getBalance() - amount;
		if(newBalance < Bank.MIN_BAL) {
			System.out.println("YOU NEED MINIMUM BALANCE 1000 IN YOUR ACCOUNT...");
		}
		acc.setBalance(newBalance);
		
		System.out.println("Balance updated");
		}else{
			System.out.println("please Enter valid Withdrow amount...");
		}
	}
}
