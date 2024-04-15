package mahaboob.com23Roughwork1InternshipCodeWay;

public class Transcations {
	public static void main(String[] args) {
		BankAccount userAccount = new BankAccount(1000.0); // Initial balance set to 1000.0
		AtmClass atmClass = new AtmClass(userAccount);
		atmClass.processTransaction();
	}

}









































