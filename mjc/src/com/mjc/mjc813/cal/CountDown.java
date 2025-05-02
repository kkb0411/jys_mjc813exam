package com.mjc.mjc813.cal;

public class CountDown {
	public int[] countdown(int start_num, int end_num) {
		int[] answer = new int[start_num-end_num+1];
		for(int i=0; i<answer.length;i++) {
			answer[i] = start_num--;
		}
		return answer;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDown cnt = new CountDown();
		int start_num = 10;
		int end_num = 3;
		int[] result = cnt.countdown(start_num, end_num);
		
		System.out.print("결과: ");
		for(int n : result) {
			System.out.print(n + " ");
		}
		
	}

}
