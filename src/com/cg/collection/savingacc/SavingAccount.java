package com.cg.collection.savingacc;

public class SavingAccount implements Comparable<SavingAccount> {
	int acc_balance;
	int acc_ID;
	String accountHoldername;
	boolean isSalaryAccount;
	static int minimumBalance = 1000;

	// defining parameterised constructor
	public SavingAccount(int acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) {
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	// if account is not a salary account then minimum balance has to be maintained
	public int withdraw(int amt) {
		if (isSalaryAccount == true) {
			if (amt < this.acc_balance) {
				this.acc_balance -= amt;
			}
		} else if ((this.acc_balance - amt) > minimumBalance)
			this.acc_balance -= amt;
		else
			System.out.println("Insufficient balance");

		return this.acc_balance;
	}

	// implementing method for deposit
	public int deposit(int amt) {
		this.acc_balance += amt;
		return this.acc_balance;
	}

	@Override
	public String toString() {
		return "\n SavingAccount -- acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + ".";
	}

	@Override
	public int compareTo(SavingAccount sa) {
		return acc_ID - sa.acc_ID;
	}
}