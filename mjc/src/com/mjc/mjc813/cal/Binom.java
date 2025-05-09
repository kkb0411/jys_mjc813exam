package com.mjc.mjc813.cal;

public class Binom {
	public static int Binom(String binomial) {
		int answer = 0;
		String[] bi = binomial.split(" ");
		int a = Integer.parseInt(bi[0]);
		String op = bi[1];
		int b = Integer.parseInt(bi[2]);
		if(op.equals("+")) {
			answer = a+b;
		}
		else if(op.equals("-")) {
			answer = a-b;
		}
		else if(op.equals("*")) {
			answer = a*b;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String binomail = "43 + 12";
		String binomail1 = "0 - 7777";
		String binomail2 = "40000 * 40000";
		
		int result = Binom(binomail);
		int result1 = Binom(binomail1);
		int result2 = Binom(binomail2);
		
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + result1);
		System.out.println("결과 : " + result2);
	}

}
