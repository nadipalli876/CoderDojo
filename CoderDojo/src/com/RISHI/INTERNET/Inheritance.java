package com.RISHI.INTERNET;

public class Inheritance extends Calculator{
	public static void main(String args[]) {
		Inheritance inherit=new Inheritance();
		inherit.add();
	}
	public int add() {
		int addnumbers=super.add(1, 2).answer();
		return addnumbers;
	}
}
