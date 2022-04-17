package com.sean.bankAccounts;

public class TestBankAccount {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		account1.depositMoney(1000, "saving");
		account1.depositMoney(500, "checking");
		System.out.printf( "Checking: %s\n Saving: %s\n Total Balance is %s", account1.getCheckingBalance(), account1.getSavingsBalance(), account1.getTotalAccountAmount());
	
		account1.withdrawMoney(50, "checking");
		account1.withdrawMoney(100, "saving");
		System.out.printf( "Checking: %s\n Saving: %s\n Total Balance is %s", account1.getCheckingBalance(), account1.getSavingsBalance(), account1.getTotalAccountAmount());
		
		System.out.println("Account Number: " + account1.getAccountNumber());
	}
	
	
}
