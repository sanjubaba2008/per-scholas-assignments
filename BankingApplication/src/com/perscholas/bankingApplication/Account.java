package com.perscholas.bankingApplication;


public class Account {
//	user will have to enter all the required information 
//	like, name, account number,account   type   and   initial   balance
//	and   using   the   switch   case   statement   they   canselect the 
//	type of transaction they want to do, and they get information regardingtheir 
//	balance also.
//	The   Bank   account   has   the   properties   User  Name, User ssn, User Address,
//	BankName , Bank Address, routing Number, account number, balance,annual, interest rate,
//	tax and date created, and methods to  deposit() andwithdraw().   Create   one   parent   class  
//	for  Banking  and   four   sub   classes   forchecking account, creditCard, privileged and savings account.
//	You are supposed to take an input from user via console. User will be able to selectone option from four options. 
//	Such as define below1 – checking account2 – saving account3 – privileges account4 - credit card You   are   free  
//	to   add   any   properties   or   features   in   each   class   such   as   withdraw,deposit, calculateTax, 
//	calucateAmountdue.You are supposed to add functionality privileged Banking Account  with OverdraftFacility. 
//	For a background, overdraft is a facility where you can withdraw an amount more than available the balance in your account.
//	You are supposed to add functionality in Creditcard, Users can pay the all dues.User will be able to add year, month and total
//	amount as an input from console
	
	// declaring properties
	private String userName;
	private int userSsn;
	private String userAddress;
	private String bankName;
	private String bankAddress;
	private double annualInterestRate;
	private double tax;
	private double balance;
	
	
	//constructors
	public Account(String userName, int userSsn, String userAddress, String bankName, String bankAddress,
			double annualInterestRate, double tax, double balance) {
		super();
		this.userName = userName;
		this.userSsn = userSsn;
		this.userAddress = userAddress;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.annualInterestRate = annualInterestRate;
		this.tax = tax;
		this.balance = balance;
	}

	public Account() {
		
	}
	public Account(String userName, int userSsn, String userAddress, String bankName, String bankAddress
			) {
		super();
		this.userName = userName;
		this.userSsn = userSsn;
		this.userAddress = userAddress;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		
	}
	//getter and setter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserSsn() {
		return userSsn;
	}
	public void setUserSsn(int userSsn) {
		this.userSsn = userSsn;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	//deposit method
	public double deposit(double depositAmount) {
		this.balance = balance + depositAmount;
		System.out.println("you have succesfully deposited" + depositAmount);
		return balance;
		
	}
	public double withdraw(double withdrawAmount) {
		this.balance = balance - withdrawAmount;
		System.out.println("you have succesfully withdrew" + withdrawAmount);
		return balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Account [userName=" + userName + ", userSsn=" + userSsn + ", userAddress=" + userAddress + ", bankName="
				+ bankName + ", bankAddress=" + bankAddress + ", annualInterestRate=" + annualInterestRate + ", tax="
				+ tax + ", balance=" + balance + "]";
	}
	
	
}
