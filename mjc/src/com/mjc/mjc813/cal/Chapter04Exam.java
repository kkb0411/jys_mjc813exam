package com.mjc.mjc813.cal;
import java.util.*;
public class Chapter04Exam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter04Exam ex = new Chapter04Exam();
		System.out.println(ex.di());
	}
	
	public String di() {
		String result = "";
		while("".equals(result)) {
			int dice01 = this.getRandomDice();
			int dice02 = this.getRandomDice();
				if(dice01 + dice02 == 5) {
					return result = "(x,y)";
				}
		}
		return result;
	}
	
	private int getRandomDice() {
		return 0;
	}
	public String dc() {
		ArrayList<int[]> result = new ArrayList<int[]>();
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				result.add(new int[] {x,y});
			}
		}
		String answer = "";
		for(int i=0; i<result.size(); i++) {
			answer += this.getResultString(result.get(i));
		}
		return answer;
	}
	private String getResultString(int[] result) {
		return "";
	}
}

	