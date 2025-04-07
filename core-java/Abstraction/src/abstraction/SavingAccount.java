package abstraction;

public class SavingAccount extends BankAccount {

	static int balance = 2000;

	@Override
	public void Withdraw(int amount) {

		System.out.println("Balance Before Withdraw: " + balance);
		balance -= amount;
		System.out.println("Balance after Withdraw: " + balance);
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Balance Before Deposit: " + balance);
		balance += amount;
		System.out.println("Balance after Deposit " + balance);
	}

}
