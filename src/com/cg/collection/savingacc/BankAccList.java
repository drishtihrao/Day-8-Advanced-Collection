package com.cg.collection.savingacc;

import java.util.Set;
import java.util.TreeSet;

public class BankAccList {
	// creating a tree set of savings account
	public Set<SavingAccount> accList = new TreeSet<SavingAccount>();

	// defining method to add a SavingAccount in the list
	public void addAccount(SavingAccount sa) {
		accList.add(sa);
	}

	// defining method to remove a SavingAccount from the list
	public void removeAccount(SavingAccount sa) {
		accList.remove(sa);
	}

}
