
public class BankAccount {
	private int bankID;
	private double bankBalance;
	private double annualInterestRate;
	private java.util.Date accountDate;
	
	public BankAccount() {
		
	}
	public BankAccount(int bankID, double bankBalance) {
		this.bankID = bankID;
		this.bankBalance = bankBalance;
		accountDate = new java.util.Date();
		
	}
	//method: get
	public int getBankID() {
		return bankID;
	}
	
	public double getBankBalance() {
		return bankBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public java.util.Date getAccountDate(){
		return accountDate;
	}
	
	//method: set
	public void setBankID(int bankID) {
		this.bankID = bankID;
	}
	public void setbankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//annual interest rate
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) * 100;
	}
	
	//withdraw and deposit
	public void withdraw(double amount) {
		this.bankBalance -= amount;
	}
	public void deposit(double amount) {
		this.bankBalance += amount;
	}
	
}
