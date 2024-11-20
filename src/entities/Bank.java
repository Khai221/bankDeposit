package entities;

public class Bank {
	private Integer accountNumber = 0;
	private String name = " ";
	private Double deposit = 0.0;
	
	public Bank(Integer accountNumber, String name, Double deposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.deposit = deposit;
	}
	
	public Bank(Integer accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	
}
