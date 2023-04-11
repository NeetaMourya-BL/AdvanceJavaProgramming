package com.bridgelabz.userdefinedexception;

import java.sql.Blob;

public class CheckingAccount {

	private double balance;
	private int accountNumber;

	public CheckingAccount(int accountNumber) {

		this.accountNumber = accountNumber;
	}

	public void depositeMoney(double amount) {
		balance += amount;
	}

	public void withdrawMoney(double amount) throws InsufficientFundsException {

		if (amount <= balance) {
			balance -= amount;
		} else {
			double requiredAmount = amount - balance;
			throw new InsufficientFundsException(requiredAmount);
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
}
