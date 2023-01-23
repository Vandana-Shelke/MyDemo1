package com.demo.exception;

public class CheckLimit {
void checkAge(int age) {
	if (age<18)
	{
		try {
			throw new AgeThrow("you are not eligible");
		}catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
	}else {
		System.out.println("welcome to the voter application");
	}
}
}
