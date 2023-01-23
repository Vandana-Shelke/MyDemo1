package com.demo.exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		CheckLimit ch=new CheckLimit();
		ch.checkAge(age);
	}

}
