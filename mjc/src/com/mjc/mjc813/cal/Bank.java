package com.mjc.mjc813.cal;

public class Bank {
	private String accountNumber;
	private String accountName;
	private int money;
	
	public Bank(String accountNumber, String accountName) {
		this(accountNumber, accountName, 0);
	}
	public Bank(String accountNumber, String accountName, int money) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.money = money;
	}
	
	void addMoney(int m) {
		if(m>0) {
			money+=m;
		}
	}
	void subMoney(int m) {
		if(m>0 && money >= m) {
			money -= m;
		}
	}
	public String getBankNumber() {
		return accountNumber;
	}
	public void setBankNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return accountName;
	}
	public void setBankName(String accountName) {
		this.accountName = accountName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money>=0) {
			this.money = money;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bnk = new Bank("123-456", "홍길동", 1000);
		
		System.out.println("계좌번호: " + bnk.getBankNumber());
		System.out.println("계좌주: " + bnk.getBankName());
		System.out.println("현재 금액 " + bnk.getMoney());
		
		bnk.addMoney(500);
		System.out.println("500원 입금 후: " + bnk.getMoney());
		bnk.subMoney(300);
		System.out.println("300원 입금 후: " + bnk.getMoney());
	}

}
