package com.perscholas.bankingApplication;

import java.time.LocalDate;

public class CheckingAccount extends Account {

	//properties
	private static int routingNumber;
	private int accountNumber;
	private double checkingBalance;
	private LocalDate dateCreated;
	
	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CheckingAccount(String userName, int userSsn, String userAddress, String bankName, String bankAddress,
			double annualInterestRate, double tax, double balance, int routingNumber, int accountNumber, LocalDate dateCreated, double checkingBalance) {
		super(userName, userSsn, userAddress, bankName, bankAddress, annualInterestRate, tax, balance);
		CheckingAccount.routingNumber = routingNumber;
		this.accountNumber = accountNumber;
		this.dateCreated = dateCreated;
		this.setCheckingBalance(checkingBalance);
		// TODO Auto-generated constructor stub
	}
	
	public CheckingAccount(String userName, int userSsn, String userAddress, String bankName, String bankAddress,LocalDate dateCreated) {
		super(userName, userSsn, userAddress, bankName, bankAddress);
		this.dateCreated = dateCreated;
		// TODO Auto-generated constructor stub
	}
	public static int getRoutingNumber() {
		return routingNumber;
	}
	public static void setRoutingNumber(int routingNumber) {
		CheckingAccount.routingNumber = routingNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	@Override
	public double deposit(double depositAmount) {
		// TODO Auto-generated method stub
		this.checkingBalance = checkingBalance + depositAmount;
		System.out.println("you have succesfully deposited" + depositAmount);
		return checkingBalance;
	}
	@Override
	public double withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		this.checkingBalance = checkingBalance - withdrawAmount;
		System.out.println("you have succesfully deposited" + withdrawAmount);
		return checkingBalance;
	}
	@Override
	public String toString() {
		return "CheckingAccount [Name = " + getUserName() + ", accountNumber=" + accountNumber + ", checkingBalance=" + checkingBalance
				+ ", dateCreated=" + dateCreated + "]";
	}
}
