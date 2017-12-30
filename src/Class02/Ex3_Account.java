package Class02;
public class Ex3_Account { 
	 private int accountNumber ; 
	 private double balance ; 
	 
	 public Ex3_Account () {
		 this.accountNumber=0;
	 this.balance=0;} 
	 
	 public Ex3_Account( int accountNumber) {
		 this.accountNumber=accountNumber;
		 this.balance=0;} 
	 
	 public Ex3_Account( int accountNumber , double balance ) {
		 this.accountNumber=accountNumber;
		 this.balance=balance;
	 } 
	 
	 public void setAccountNumber( int accountNumber) {this.accountNumber=accountNumber;} 
	 public int getAccountNumber () {return this.accountNumber;} 
	 public void setBalance (double balance ) {this.balance=balance;} 
	 public double getBalance () {return this.balance;} 
	 
	 public void credit (double amount) {this.balance+=amount;} 
	 public void debit (double amount) {this.balance-=amount;} 
	 @Override
	 public String toString () {
		 return "Your number is : " + this.accountNumber + " You have " + this.balance + " money";
	 } 
	 	
	}
