package nelioFixacao;

public class Account {
	private int accountNumber;
	private String accountUser;
	private double userSavings;
	public Account(int accountNumber, String accountUser) {
		this.accountNumber = accountNumber;
		this.accountUser = accountUser;
	}
	public Account(int accountNumber, String accountUser, double userSavings) {
		this.accountNumber = accountNumber;
		this.accountUser = accountUser;
		this.userSavings = userSavings;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountUser() {
		return accountUser;
	}
	public void setAccountUser(String accountUser) {
		this.accountUser = accountUser;
	}
	public double getUserSavings() {
		return userSavings;
	}

	void subtract(double value){
		this.userSavings-=value; 
	}
	void add(double value){
		this.userSavings+=value; 
	}
		
	public String toString() {
		return "Account: "
		+accountNumber
		+ ", User: "
		+ accountUser
		+ ", Savings: "
		+ String.format("%.2f", userSavings);
		}


}
