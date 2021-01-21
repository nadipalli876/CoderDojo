package com.RISHI.INTERNET;
public class Calculator2 {
	
	public void add(int firstNumber,int secondNumber) {
		int sum=firstNumber+secondNumber;
		System.out.println(sum);
	}
	public void substract(int firstNumber,int secondNumber) {
		int sum=firstNumber-secondNumber;
		System.out.println(sum);
	}
	public void multiply(int firstNumber,int secondNumber) {
		int sum=firstNumber*secondNumber;
		System.out.println(sum);
	}
	public void divide(int firstNumber,int secondNumber) {
		int sum=firstNumber/secondNumber;
		System.out.println(sum);
	}
	public static void main(String[] args){

		Calculator2 math=new Calculator2();
		math.add(1, 2);
		math.substract(8, 4);
		math.multiply(5, 8);
		math.divide(40, 8);
		
	}

}
