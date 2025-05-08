package com.mjc.mjc813.cal;

import java.util.Scanner;

public class FindOne {
	public int FindOne(int[]arr, int idx) {
		int answer = 0;
		for(int i=0; i<arr.length; i++) {
			if(i>=idx && arr[i] == 1) {
				answer = i;
				break;
			}else {
				answer = -1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindOne fo = new FindOne();
		int[] arr1 = {0,0,0,1,0,1};
		int idx1 = 2;
		System.out.println("결과1: " + fo.FindOne(arr1, idx1));
		
		int[] arr2 = {0,0,0,0};
		int idx2 = 1;
		System.out.println("결과2: " + fo.FindOne(arr2, idx2));
		}
}