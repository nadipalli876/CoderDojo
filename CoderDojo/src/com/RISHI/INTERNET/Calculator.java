package com.RISHI.INTERNET;

public class Calculator {
	int answer = 0;

	public Calculator add(int number,int number1) {
		answer = number+number1;
		return this;
	}

	public Calculator subtract(int number,int number1) {
		answer = number-number1;
		return this;
	}

	public Calculator multiply(int number,int number1) {
		answer = number*number1;
		return this;
	}

	public Calculator divide(int number,int number1) {
		answer = number/number1;
		return this;
	}
	public Calculator modulus(int number,int number1) {
		answer = number%number1;
		return this;
	}
	public int answer() {
		return answer;
	}

	public static void main(String[] args) {

	}

}
