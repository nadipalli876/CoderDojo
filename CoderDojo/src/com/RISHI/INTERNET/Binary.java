package com.RISHI.INTERNET;

public class Binary {
	public int and(int number1,int number2) {
		int result=number1&number2;
		return result;
		
	}
	public int or(int number1,int number2) {
		int result=number1|number2;
		return result;
		
	}
	public int XOR(int number1,int number2) {
		int result=number1^number2;
		return result;
		
	}
	public int compliment(int number1) {
		int result=~number1;
		return result;
		
	}public int leftshift(int number1,int number2) {
		int result=number1<<number2;
		return result;
		
	}public int rightshift(int number1,int number2) {
		int result=number1>>number2;
		return result;
		
	}public int zerofillrightshift(int number1,int number2) {
		int result=number1>>>number2;
		return result;
		
	}
}
