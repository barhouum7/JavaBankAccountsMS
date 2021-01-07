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

    public void transfer1(Account account, double balance) {
        if ((this.accountBalance - balance) < this.maxOverDraft)
            System.out.println("Unauthorized Operation!");
        else {
            this.debit(balance);
            account.credit(balance);

        }

    }

    public void transfer2(Account account1, Account account2, double balance) {
        if ((account1.accountBalance - balance) < account1.getMaxOverDraft())
            System.out.println("Unauthorized Operation!");
        else {
            account1.debit(balance);
            account2.credit(balance);

        }
    }

    @Override
    public String toString() {
        return "\nAccount's full info with ID=" + accountId + " are: [  Balance=" + accountBalance + ", OverDraft="
                + maxOverDraft + ", Max Debit=" + maxDebit + ", \nAccount Holder=" + accountHolder + "  ] ";
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setBalance(double balance) {
        accountBalance = balance;
    }

    public double getMaxOverDraft() {
        return maxOverDraft;
    }

    public void setMaxOverDraft(double maxOverDraft) {
        this.maxOverDraft = maxOverDraft;
    }

    public boolean getIsOverDraft() {
        return isOverDraft;
    }

    public void setIsOverDraft(boolean isOverDraft) {
        this.isOverDraft = isOverDraft;
    }

    public double getMaxDebit() {
        return maxDebit;
    }

    public void setMaxDebit(double maxDebit) {
        this.maxDebit = maxDebit;
    }
}