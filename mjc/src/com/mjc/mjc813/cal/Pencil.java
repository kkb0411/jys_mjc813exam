package com.mjc.mjc813.cal;

public class Pencil {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		int peincilsPerStudent = pencils/students;
		System.out.println(peincilsPerStudent);
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
	}

}
