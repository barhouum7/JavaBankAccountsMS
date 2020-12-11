# JavaBankAccountsMS
I'm going to build a simple Bank Accounts Management System in Java, I'm gonna just use core java (Console App) without any SE or EE application
## Project Notes🗒📝
### Account Class:
#### I. Variables:
1. Overdraft:
###### The overdraft of an account is zero if the account balance is positive or zero, it is equal to the absolute value of the balance if the latter is negative.
2. Account Balance:
###### Under no circumstances may the balance of an account be less than a value set for this account. This value is defined as - (minus) the <b>maximum</b> overdraft allowed for this account. See the example below:
###### <b>For example</b>, for an account whose maximum authorized overdraft is 2000 TND, the balance cannot be less than -2000 TND.
###### Note: Currency Used is TuNisian Dinar.
3. Maximum OverDraft:
###### <b>The maximum authorized overdraft</b> may vary from one account to another, it is arbitrarily set by the bank when the account is created, and can then be revised according to changes in the income of the account holder.
4. Maximum Debit:
###### During a withdrawal operation, an account <b><u>may not be debited by an amount greater</u></b> than a value designated under the term <b>maximum authorized debit</b>.
###### Like <b>the maximum authorized overdraft</b>, the maximum authorized debit may vary from one account to another and is set arbitrarily by the bank when the account is created. --> It can then be revised according to changes in the income of the account holder.
###### The default values for the <b>maximum authorized overdraft</b> and the <b>maximum authorized debit</b> are <u>800 TND and 1000 TND</u>, respectively. --> It is possibly possible to assign other values to these characteristics of the account when it is created.
#### II. Methods: