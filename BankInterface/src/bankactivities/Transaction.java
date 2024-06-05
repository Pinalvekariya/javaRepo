package bankactivities;

public class Transaction {
	
	public static void main(String args[]) {
		
		Account acc = new Account();
		acc.setAccountName("parth patel");
		acc.setEmail("parth@gmail.com");
		acc.setBalance(1000);
		
		onTransaction tc  = new onTransaction();
//		tc.deposit(acc,1);
		
		System.out.println(acc);
		
		tc.withdrow(acc,15000);
		
		System.out.println(acc);
	}
}
