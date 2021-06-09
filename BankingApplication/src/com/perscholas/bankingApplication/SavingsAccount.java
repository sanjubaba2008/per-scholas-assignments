package com.perscholas.bankingApplication;

import java.time.LocalDate;

public class SavingsAccount extends Account {

	// properties
	private static int savingAccountRoutingNumber;
	private int savingAccountNumber;
	private double savingAccountBalance;
	private LocalDate dateCreated;

//construcotrs
     public SavingsAccount() {
	     super();
     }
     public SavingsAccount(String userName, int userSsn, String userAddress, String bankName, String bankAddress,
 			double annualInterestRate, double tax, double balance, int savingAccountRoutingNumber, int savingAccountNumber, double savingAccountBalance, LocalDate dateCreated) {
    	 super(userName, userSsn, userAddress, bankName, bankAddress, annualInterestRate, tax, balance);
    	 this.savingAccountBalance = savingAccountBalance;
    	 this.savingAccountNumber = savingAccountNumber;
    	 SavingsAccount.savingAccountRoutingNumber = savingAccountRoutingNumber;
    	 this.dateCreated = dateCreated;
     }
	public SavingsAccount(String userName, int userSsn, String userAddress, String bankName, String bankAddress,LocalDate dateCreated ) {
		super(userName, userSsn, userAddress, bankName, bankAddress);
		this.dateCreated = dateCreated;
		// TODO Auto-generated constructor stub
	}
    


}

