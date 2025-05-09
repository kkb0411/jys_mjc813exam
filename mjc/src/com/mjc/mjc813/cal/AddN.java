package com.mjc.mjc813.cal;

public class AddN {
	public static int AddN(int[] numbers, int n) {
		int answer = 0;
		for(int i=0; i<numbers.length;i++) {
			answer += numbers[i];
			if(answer>n) {
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = 123;
		int[] numbers1 = {58, 44, 27, 10, 100};
		int n1 = 139;
		int result = AddN(numbers,n);
		int result1 = AddN(numbers1, n1);
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + result1);
	}

}
