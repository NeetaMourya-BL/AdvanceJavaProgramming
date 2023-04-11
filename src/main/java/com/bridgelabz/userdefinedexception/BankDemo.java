package com.bridgelabz.userdefinedexception;

public class BankDemo {
	public static void main(String[] args) {

		CheckingAccount checkingAccount = new CheckingAccount(101);
		System.out.println("Deposite amount 500");
		checkingAccount.depositeMoney(500.00);

		try {
			System.out.println("Withdraw the amount 100");
			checkingAccount.withdrawMoney(100.00);
			System.out.println("Withdraw the amount 600");
			checkingAccount.withdrawMoney(600.00);
		} catch (InsufficientFundsException e) {
			System.out.println("Sorry, you are not having sufficient fund to withdraw the same amount:" + e);
			e.printStackTrace();
		}
	}

}
