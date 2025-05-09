package com.mjc.mjc813.cal;

import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println(a+ " + " + b + " = " + (a+b));
		sc.close();
	}

}
