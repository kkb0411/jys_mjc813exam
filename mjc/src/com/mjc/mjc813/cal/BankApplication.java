package com.mjc.mjc813.cal;
import java.util.*;

import java.util.Scanner;

public class BankApplication {
    private Account[] accounts;
    private int count;

    public BankApplication() {
        this.accounts = new Account[100]; // 최대 100개 계좌
        this.count = 0;
    }

    // 계좌 생성
    public void createAccount(String accountNumber, String owner, int money) {
        accounts[count++] = new Account(accountNumber, owner, money);
        System.out.println("계좌가 생성되었습니다.");
    }

    // 계좌 목록 출력
    public void showAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.printf("계좌번호: %s, 이름: %s, 잔액: %d\n",
                    accounts[i].getAccountNumber(),
                    accounts[i].getOwner(),
                    accounts[i].getMoney());
        }
    }

    // 입금
    public void deposit(String accountNumber, int money) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].setMoney(accounts[i].getMoney() + money);
                System.out.println("입금이 완료되었습니다.");
                return;
            }
        }
        System.out.println("계좌번호를 찾을 수 없습니다.");
    }

    // 출금
    public void draw(String accountNumber, int money) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                if (accounts[i].getMoney() >= money) {
                    accounts[i].setMoney(accounts[i].getMoney() - money);
                    System.out.println("출금이 완료되었습니다.");
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
                return;
            }
        }
        System.out.println("계좌번호를 찾을 수 없습니다.");
    }

    // 특정 계좌 잔액 조회 (JUnit 테스트용)
    public int getMoneyFromAccountNumber(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i].getMoney();
            }
        }
        return -1; // 계좌 없을 경우
    }

    // 메인 실행 메소드
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankApplication bk = new BankApplication();
        boolean run = true;

        while (run) {
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.print("선택> ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 줄바꿈 처리

            switch (choice) {
                case 1:
                    System.out.print("계좌번호: ");
                    String accNo = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String owner = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int money = scanner.nextInt();
                    bk.createAccount(accNo, owner, money);
                    break;
                case 2:
                    bk.showAccounts();
                    break;
                case 3:
                    System.out.print("계좌번호: ");
                    String depAcc = scanner.nextLine();
                    System.out.print("입금액: ");
                    int depMoney = scanner.nextInt();
                    bk.deposit(depAcc, depMoney);
                    break;
                case 4:
                    System.out.print("계좌번호: ");
                    String drawAcc = scanner.nextLine();
                    System.out.print("출금액: ");
                    int drawMoney = scanner.nextInt();
                    bk.draw(drawAcc, drawMoney);
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
            System.out.println();
        }
        scanner.close();
    }
}

