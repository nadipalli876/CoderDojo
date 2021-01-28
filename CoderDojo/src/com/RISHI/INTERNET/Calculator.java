package com.RISHI.INTERNET;

public class Calculator {
	int answer = 0;

	public Calculator add(int number) {
		answer += number;
		return this;
	}

	public Calculator substract(int number) {
		answer -= number;
		return this;
	}

	public Calculator multiply(int number) {
		answer *= number;
		return this;
	}

	public Calculator divide(int number) {
		answer /= number;
		return this;
	}

	public int answer() {
		return answer;
	}

	public static void main(String[] args) {

		Calculator math = new Calculator();
		int total = math.add(10).substract(5).multiply(3).add(3).answer();
		System.out.println("Answer: " + total);

	}

}
