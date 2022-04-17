package com.sean.bankAccounts;
import java.util.Random;
import java.util.ArrayList;

public class BankAccount {
	private Double checkingBalance;
	private Double savingsBalance;
	private static ArrayList<Integer> accountNumber;
	public static int numberOfAccounts = 0;
	private static double totalAccountAmount = 0;
	
//	public BankAccount(double checkBal, double saveBal, double accountTotal) {
//		checkingBalance = checkBal;
//		savingsBalance = saveBal;
//		totalAccountAmount = (checkBal + saveBal);
//		numberOfAccounts++;	
	
//	}
	
	private static ArrayList<Integer> createAccountNum() {
		Random randAccount = new Random();
		for (int i=0; i<12; i++); {
			accountNumber.add(randAccount.nextInt(12));
		}
		return accountNumber;
	}
	
	public BankAccount( ) {
		numberOfAccounts++;
		BankAccount.accountNumber = createAccountNum();
	}
		
	
	public BankAccount(Double checkingBalance, Double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
	}


	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public Double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public double getTotalAccountAmount() {
		return totalAccountAmount;
	}
	
	public ArrayList<Integer> getAccountNumber() {
		return accountNumber;
	}
	
	public void depositMoney(double amount, String account) {
		if (account.equals("saving")) {
			savingsBalance += amount;
		}
		else if (account.equals("checking")) {
			checkingBalance += amount;
		}
		totalAccountAmount += amount;
	}
	
	public void withdrawMoney(double amount, String account) {
		if (account.equals("saving")) {
			savingsBalance -= amount;
		}
		else if (account.equals("checking")) {
			checkingBalance -= amount;
		}
		else if (savingsBalance <= 0) {
			System.out.println("You broke fool!");
		}
		else if (checkingBalance <= 0) {
			System.out.println("Inflation is real...");
		}
		totalAccountAmount -= amount;
	}

		
	}

