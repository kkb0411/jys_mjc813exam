package com.mjc.mjc813.cal;

public class Account {
    private String accountNumber;
    private String owner;
    private int money;

    public Account(String accountNumber, String owner, int money) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}