package bankactivities;

public interface Bank {

	int MIN_BAL = 1000;
	int DEPOSIT_LIMIT = 20000;
	int WITHDROW_LIMIT = 10000;
	
	void deposit(Account acc,int amount);
	void withdrow(Account acc,int amount);
}
