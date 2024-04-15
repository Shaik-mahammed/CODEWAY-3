package mahaboob.com23Roughwork1InternshipCodeWay;

import java.util.Scanner;

public class AtmClass {
	private BankAccount account;

	public AtmClass(BankAccount account) {
		this.account = account;
	}

	public void displayMenu() {
		System.out.println("\nATM Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
	}

	public void processTransaction() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			displayMenu();
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				System.out.print("Enter amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				deposit(depositAmount);
				break;
			case 3:
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				withdraw(withdrawAmount);
				break;
			case 4:
				System.out.println("Exiting AtmClass. Thank you!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 4);
		scanner.close();
	}

	private void checkBalance() {
		System.out.println("Current Balance: " + account.getBalance());
	}

	private void deposit(double amount) {
		account.deposit(amount);
	}

	private void withdraw(double amount) {
		account.withdraw(amount);
	}
}
