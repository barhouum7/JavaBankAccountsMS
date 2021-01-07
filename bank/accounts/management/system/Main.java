package bank.accounts.management.system;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Ibrahim", "BHMBS", "47 ST MZH");
		// System.out.println(customer1.toString());
		Account account1 = new Account(customer1, 100, -120, 30);
		// System.out.println(account1);

		Customer customer2 = new Customer("John", "Doe", "32 CA ST");
		// System.out.println(customer2.toString());
		Account account2 = new Account(customer2);
		// System.out.println(account2);

		account2.setMaxDebit(300);
		account2.setBalance(1300);

		// System.out.println("\n\n\tNow the balance of the 2nd Account is: " +
		// account2.getBalance() + "\n");
		// System.out.println(account2);

		account1.credit(50);
		System.out.println("\n\nBalance of the 1st account after credit: " + account1.getBalance() + "\n");
		System.out.println(account1);

		account2.debit(2200);
		System.out.println("\n\nBalance of the 2nd account after debit: " + account2.getBalance() + "\n");
		System.out.println(account2);

		account1.withdrawal(40); // Unauthorized Operation Because MAX Debit is $30
		System.out.println("\n\nBalance of the 1st account after withdrawal $40: " + account1.getBalance() + "\n");
		account1.withdrawal(10); // Authorized Operation!
		System.out.println("\n\nBalance of the 1st account after withdrawal $10: " + account1.getBalance() + "\n");
		account1.transfer1(account2, 100);
		System.out.println("\n\nAfter this transfer:  \nBalance of the sender= " + account1.getBalance()
				+ "\n Balance of the receiver= " + account2.getBalance());
	}

}
