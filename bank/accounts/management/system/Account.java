package bank.accounts.management.system;

public class Account {

    private static int accountId = 0;
    private double accountBalance;
    private double maxOverDraft;
    private boolean isOverDraft = false;
    private double maxDebit;
    final Customer accountHolder; // Constant

    /**
     * 
     * @param holder
     * @param balance
     * @param maxOverDraft
     * @param maxDebit
     */
    public Account(Customer holder, double balance, double maxOverDraft, double maxDebit) {
        this.accountHolder = holder;
        this.accountBalance = balance;
        this.maxOverDraft = maxOverDraft;
        this.maxDebit = maxDebit;
        accountId++;
    }

}