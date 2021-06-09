package com.perscholas.bankingApplication;

import java.time.LocalDate;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please choose one of the option below: "
				+ "\n" + "1. Checking Account \n"
				 + "2. Savings Account \n"+ "3. Previledge Account \n" + "4. Credit Card Account");
		
		System.out.println();
		System.out.print("Please enter a number between 1 - 4 :");
		Scanner scan  = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println();
		
		if(i==1) {
			Account account = new CheckingAccount("Sanjaya", 123456057,"Dallas, Texas","Chase","123 street",10.0,9.75,100000,123456789,909560078,LocalDate.now(),10000);
			System.out.print(account.toString());
		}
		else if(i==2) {
			
		}

	}

}
//String userName, int userSsn, String userAddress, String bankName, String bankAddress,
//double annualInterestRate, double tax, double balance, int routingNumber, 
//int accountNumber, Date dateCreated, double checkingBalance)