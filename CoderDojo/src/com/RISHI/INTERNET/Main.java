package com.RISHI.INTERNET;

public class Main {

	public static void main(String[] args) {
		Relational math=new Relational();
		boolean equal=math.equals(7, 4);
		System.out.println("The statment 7=4 is "+equal);
		boolean greater=math.greater(7, 4);
		System.out.println("The statment 7>4 is "+greater);
		boolean less=math.less(7, 4);
		System.out.println("The statment 7<4 is "+less);
		boolean greaterorequal=math.greaterorequal(7, 4);
		System.out.println("Thhe statment 7>=4 is "+greaterorequal);
		boolean lessorequal=math.lessorequal(7, 4);
		System.out.println("The statment 7<=4 is "+lessorequal);
	}

}
