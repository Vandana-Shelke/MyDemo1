package com.demo.exception;

public class Exception {

	public static void main(String[] args) {
		try {
			int b=10/0;
		}  catch(ArithmeticException e)  
		{
			System.out.println(e);
		}finally
		{
			System.out.println("Its Finally Block");
		}
	
	}

}
