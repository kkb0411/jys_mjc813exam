package com.mjc.mjc813.cal;
import java.util.*;
public class BankApplication {
	private Account[] accounts = new Account[100];
	private int accountCount = 0;
	
	public int getAccountSize() {
		return accountCount;
	}
	public void addAccount(String accountNumber, String accountName, int money) {
		if(accountCount>= accounts.length) {
			System.out.println("더 이상 계좌를 생성할 수 없습니다.");
			return;
		}
		accounts[accountCount++] = new Account(accountNumber, accountName, money);
		System.out.println("계좌가 생성되었습니다.");
	}
	
	public void printAccounts() {
		System.out.println("계좌번호\t\t계좌주\t\t잔액");
		for(int i=0; i<accountCount; i++) {
			Account acc = accounts[i];
			System.out.println("%s\t%s\t\t%d\n",
					acc.getAccountNumber(),
					acc.getAccountName(),
					acc.getMoney());
		}
	}
	
	public void depsit(String accountNumber, int money) {
		Account acc = findAccount(accountNubmer);
		if(acc != null) {
			acc.addMoney(money);
			System.out.println("입금이 완료되었습니다.");	
		}else {
			System.out.println("계좌를 찾을 수 없습니다.");
		}
	}
	public void draw(String accountNumber, int money) {
		Account acc = findAccount(accountNumber);
		
		if(acc != null) {
			if(acc.getMoney() >= money) {
				acc.subMoney(money);
				System.out.println("출급이 완료되었습니다.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}
		}else {
			System.out.println("계좌를 찾을 수 없습니다.");
		}
	}
	private Account findAccount(String accountNumber) {
		for(int i=0; i<accountCount; i++) {
			if(accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
	public int getMoneyFromAccountNumber(String accountNumber) {
		Account acc = findAccount(accountNumber);
		return acc != null ? acc.getMoney() : -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
