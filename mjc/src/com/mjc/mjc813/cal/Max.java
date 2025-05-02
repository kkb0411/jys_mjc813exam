package com.mjc.mjc813.cal;

import java.util.Arrays;
import java.lang.Math;

public class Max {
	public int max(int[] numbers) {
		int answer = 0;
		Arrays.sort(numbers);
		answer = Math.max(numbers[0]*numbers[1], numbers[numbers.length-1]*numbers[numbers.length-2]);
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max max= new Max();
		System.out.println("[1, 2, -3, 4, -5] => " + max.max(new int[] {1, 2, -3, 4, -5}));
		System.out.println(max.max(new int[] {0, -31, 24, 10, 1, 9}));
		System.out.println(max.max(new int[] {10, 20, 30, 5, 5, 20, 5}));
	}
}