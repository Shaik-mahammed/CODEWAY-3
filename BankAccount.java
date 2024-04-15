package mahaboob.com23Roughwork1InternshipCodeWay;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. Current balance: " + balance);
	}

	public boolean withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawal successful. Current balance: " + balance);
			return true;
		} else {
			System.out.println("Insufficient funds. Withdrawal failed.");
			return false;
		}
	}
}


















