package abstraction;

public class Bank {
	public static void main(String args[]) {
		SavingAccount savingaccount = new SavingAccount();
		CurrentAccount currentaccount = new CurrentAccount();

		System.out.println("Saving Account Details...........");
		savingaccount.deposit(300);
		System.out.println(" ");
		savingaccount.Withdraw(100);

		System.out.println(" ");
		System.out.println("Current Account Details...........");
		currentaccount.deposit(2000);
		System.out.println(" ");
		currentaccount.Withdraw(500);
	}
}
