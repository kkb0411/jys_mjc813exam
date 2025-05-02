package com.mjc.mjc813.cal;

public class Mycalculator {
	public int myAdd(int a, int b) {
		 return a+b;
		}
		public long myAdd(long a, long b) {
			return a+b;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestJava MyClass main");
		Mycalculator mCal = new Mycalculator();
		
		int result1 = mCal.myAdd(10, 30);
		System.out.println("두 수(10,30)의 값은 " + result1 + "입니다.\n");
		
		long result2 = mCal.myAdd(123456789012345L, 98765432198765L);
		System.out.println("두 수(123456789012345L, 98765432198765L)의 값은 " + result2 + "입니다.\n");
	}

}
