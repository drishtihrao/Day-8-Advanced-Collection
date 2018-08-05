package com.cg.collection.test;

import com.cg.collection.savingacc.BankAccList;
import com.cg.collection.savingacc.SavingAccount;

public class TestBankAcc {

	public static void main(String[] args) {
		// creating an object of class BankAccList
		BankAccList bankAccList = new BankAccList();

		SavingAccount sa1 = new SavingAccount(1000, 101, "Sayali", false);
		SavingAccount sa2 = new SavingAccount(20000, 106, "DR", true);
		SavingAccount sa3 = new SavingAccount(1300, 102, "KW", false);
		SavingAccount sa4 = new SavingAccount(10200, 109, "PR", true);
		SavingAccount sa5 = new SavingAccount(10200, 110, "PR", true);

		// adding 5 objects of SavingAccount to the bankAccList
		bankAccList.addAccount(sa1);
		bankAccList.addAccount(sa5);
		bankAccList.addAccount(sa2);
		bankAccList.addAccount(sa3);
		bankAccList.addAccount(sa4);

		// printing the list
		bankAccList.accList.stream().forEach(System.out::print);

		System.out.println(" ");

		bankAccList.removeAccount(sa3);
		bankAccList.accList.stream().forEach(System.out::print);
	}

}
