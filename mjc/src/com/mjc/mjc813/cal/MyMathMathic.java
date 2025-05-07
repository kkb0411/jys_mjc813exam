package com.mjc.mjc813.cal;
import java.lang.Math;
public class MyMathMathic {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public long mul(int a, int b) {
		return a*b;
	}
	public int divM(int a, int b) {
		return a/b;
	}
	public int divN(int a, int b) {
		return a%b;
	}
	public boolean same(int a, int b) {
		if(a==b) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean notsame(int a, int b) {
		if(a!=b) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean big(int a, int b) {
		if(a>b) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean small(int a, int b) {
		if(a<b) {
			return true;
		}
		else {
			return false;
		}
	}
	public int shiftLeft(int a, byte b) {
		return a<<b;
	}
	public int shiftRight(int a, byte b) {
		return a>>b;
	}
	public int shiftRight0(int a, byte b) {
		return a>>>b;
	}
	public long square(int a, byte b) {
		return a*=b;
	}
	public int  absolute(int a) {
		return Math.abs(a);
	}
	public String toHex(int a) {
		return Integer.toHexString(a);
	}
	public String toBin(int a) {
		return Integer.toBinaryString(a);
	}
	public String toOct(int a) {
		return Integer.toOctalString(a);
	}
	public int toDec(int a) {
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMathMathic MMM = new MyMathMathic();
		 System.out.println("Add: " + MMM.add(10, 5));
	        System.out.println("Sub: " + MMM.sub(10, 5));
	        System.out.println("Mul: " + MMM.mul(10, 5));
	        System.out.println("DivM: " + MMM.divM(10, 3));
	        System.out.println("DivN: " + MMM.divN(10, 3));

	        // 비교 연산 테스트
	        System.out.println("Same(int): " + MMM.same(10, 10));
	        System.out.println("NotSame: " + MMM.notsame(10, 5));
	        System.out.println("Big: " + MMM.big(10, 5));
	        System.out.println("Small: " + MMM.small(3, 5));

	        // 기타 연산 테스트
	        System.out.println("Shift Left: " + MMM.shiftLeft(8, (byte) 2));
	        System.out.println("Shift Right: " + MMM.shiftRight(8, (byte) 2));
	        System.out.println("Shift Right 0: " + MMM.shiftRight0(-8, (byte) 2));
	        System.out.println("Square: " + MMM.square(2, (byte) 5));
	        System.out.println("Absolute: " + MMM.absolute(-25));
	        System.out.println("To Hex: " + MMM.toHex(255));
	        System.out.println("To Bin: " + MMM.toBin(255));
	        System.out.println("To Oct: " + MMM.toOct(255));
	        System.out.println("To Dec: " + MMM.toDec(12345));
	}
}
	
