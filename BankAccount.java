public class BankAccount {
	private double balance;
	private int accountID;
	private String password;
	public BankAccount(int accountID, String password) {
		this.accountID = accountID;
		this.password = password;
		balance = 0;
	}
	public double getBalance() {return balance;}
	public int getAccountID() {return accountID;}
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}
	public boolean withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			return true;
		}
		return false;
	}
	public String toString() {
		return String.valueOf(accountID) + "\t" + String.valueOf(balance);
	}
}
