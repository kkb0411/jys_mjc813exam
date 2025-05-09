package com.mjc.mjc813.cal;

public class FirstMinus {
	public static int FirstMinus(int[] num_list) {
		int answer = 0;
		for(int i=0; i<num_list.length; i++) {
			if(num_list[i]<0) {
				answer = i;
				break;
			}
			else if(num_list[i]>0) {
				answer = -1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		int[] num_list1 = {13, 22, 53, 24, 15, 6};
		int result = FirstMinus(num_list);
		int result1 = FirstMinus(num_list1);
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + result1);
	}

}
