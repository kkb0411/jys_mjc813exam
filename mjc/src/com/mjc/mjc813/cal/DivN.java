package com.mjc.mjc813.cal;

public class DivN {
	public int DivN(String number) {
		int sum = 0;
		for(int i=0; i<number.length();i++) {
			sum += Character.getNumericValue(number.charAt(i));
		}
		int remainder = sum % 9;
		return remainder;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivN dn = new DivN();
		
		String number1 = "123";
		System.out.println("결과1: " + dn.DivN(number1));
		
		String number2 = "78720646226947352489";
		System.out.println("결과2: " + dn.DivN(number2));
		
	}

}
