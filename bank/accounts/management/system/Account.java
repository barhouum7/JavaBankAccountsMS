package bank.accounts.management.system;

public class Account {

    private static int accountId = 0;
    private double accountBalance;
    private double maxOverDraft;
    private boolean isOverDraft = false;
    private double maxDebit;
    final Customer accountHolder; // Constant

    public Account(Customer holder, double balance, double maxOverDraft, double maxDebit) {
        this.accountHolder = holder;
        this.accountBalance = balance;
        this.maxOverDraft = maxOverDraft;
        this.maxDebit = maxDebit;
        accountId++;
    }

    public Account(Customer holder) {
        this.accountHolder = holder;
        this.accountBalance = 0;
        this.maxOverDraft = -800;
        this.maxDebit = 1000;
        accountId++;
    }

    public void credit(double balance) {
        this.accountBalance += balance;
    }

    public void debit(double balance) {
        if ((this.accountBalance - balance) < this.maxOverDraft)
            System.out.println("Unauthorized operation!");
        else
            this.accountBalance -= balance;
    }

    public void withdrawal(double balance) {
        if (balance > this.maxDebit)
            System.out.println("Unauthorized withdrawal amount!");
        else
            this.debit(balance);
    }

    public boolean isOverDraft() {
        boolean testResult = (this.accountBalance < 0) ? true : false;
        return testResult;
    }

    public double overDraftAmount() {
        if (this.accountBalance < 0) {
            this.isOverDraft = true;
            return Math.abs(this.accountBalance);
        } else
            return 0;
    }

}