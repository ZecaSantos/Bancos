package entities;

public class Client {
	
	private int accountNumber;
	private String accountHolder;
	private Double date;
	private char option;
	
	public Client(int accountNumber, String accountHolder, double date, char option) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.date = date;
		this.option = option;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getDate() {
		return date;
	}
	
	public void setDate(double date) {
		this.date = date;
	}
	
	public char getOption() {
		return option;
	}
	

}

