package cqut.yook.entiy;

public class Account {
	private Integer id;
	private String userName;
	private double balance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "id:" + id + ",name:" + userName + ",balance:" + balance;
	}
}
