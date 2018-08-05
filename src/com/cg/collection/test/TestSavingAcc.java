package com.cg.collection.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.cg.collection.savingacc.SavingAccount;

public class TestSavingAcc {

	public static void main(String[] args) {
		// creating new array list and adding 5 objects of SavingAccount in it
		List<SavingAccount> list = new ArrayList<>();

		SavingAccount sa1 = new SavingAccount(1000, 101, "Sayali", false);
		SavingAccount sa2 = new SavingAccount(20000, 106, "DR", true);
		SavingAccount sa3 = new SavingAccount(1300, 102, "KW", false);
		SavingAccount sa4 = new SavingAccount(10200, 109, "PR", true);
		SavingAccount sa5 = new SavingAccount(10200, 109, "PR", true);

		list.add(sa1);
		list.add(sa2);
		list.add(sa5);
		list.add(sa3);
		list.add(sa4);

		// printing the array list
		list.stream().forEach(System.out::print);

		// withdrawing money from a non-salary SavingAccount
		int amount = sa1.withdraw(1000);
		System.out.println("Amount after withdraw is " + amount);

		// depositing money in the account
		amount = sa3.deposit(5000);
		System.out.println("Amount after deposit is " + amount);

		// creating a file and storing the array list and printing it
		File file = new File(list.toString());
		System.out.println(file);
	}

}
