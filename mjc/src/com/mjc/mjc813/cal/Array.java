package com.mjc.mjc813.cal;

public class Array {
	public int[] array(int n, int k) {
		int[] answer = new int[n/k];
		for(int i=1; i<=n/k; i++) {
			answer[i-1] = k*i;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array arr = new Array();
		
		int n = 15;
		int k = 5;
		int[] result = arr.array(n,k);
		
		System.out.print("k의 배수 결과: ");
		for(int num : result) {
			System.out.print(num+ " ");
		}
	}

}
