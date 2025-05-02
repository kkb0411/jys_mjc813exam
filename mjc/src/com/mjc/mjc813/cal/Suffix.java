package com.mjc.mjc813.cal;
import java.util.Arrays;

public class Suffix {
	public String[] suffix(String my_string) {
		int length = my_string.length();
		String[] suffixes = new String[length];
		
		for(int i=0; i<length; i++) {
			suffixes[i] = my_string.substring(i);
		}
		Arrays.sort(suffixes);
		return suffixes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suffix suf = new Suffix();
		String my_string = "banana";
		String[] result = suf.suffix(my_string);
		
		System.out.println("정렬된 접니사:");
		for(String suffix : result) {
			System.out.println(suffix);
		}
		
	}

}
