package com.mjc.mjc813.cal;
import java.util.*;
public class Chapter04Exam {
	private int getRandomDice() {
		return 0;
	}
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
}



	