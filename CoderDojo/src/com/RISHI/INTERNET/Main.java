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
		System.out.println("The statment 7>=4 is "+greaterorequal);
		boolean lessorequal=math.lessorequal(7, 4);
		System.out.println("The statment 7<=4 is "+lessorequal);
		
		Logical logic=new Logical();
		boolean a =true;
		boolean b=false;
		System.out.println("a&&b="+logic.and(a, b));
		System.out.println("a||b="+logic.or(a, b));
		System.out.println("!(a||b)="+logic.not(a));

		Calculator arithmetic = new Calculator();
		int add=arithmetic.add(1, 2).answer();	
		System.out.println("1+2: "+ add);
		int subtract=arithmetic.subtract(2, 1).answer();	
		System.out.println("2-1: "+ subtract);
		int multiply=arithmetic.add(1, 2).answer();	
		System.out.println("1x2: "+ multiply);
		int divide=arithmetic.divide(2,1 ).answer();	
		System.out.println("2/1: "+ divide);
		int modulus=arithmetic.modulus(90, 8).answer();	
		System.out.println("90%8: "+ modulus);
		
		Binary binary=new Binary();
		int binaryOr=binary.or(5, 6);
		System.out.println("5|6="+binaryOr);
		int binaryAnd=binary.and(5, 6);
		System.out.println("5|6="+binaryAnd);
		int binarycompliement=binary.compliment(5);
		System.out.println("5|6="+binarycompliement);
		int rightshift=binary.rightshift(5, 6);
		System.out.println("5|6="+rightshift);
		int leftshift=binary.leftshift(5, 6);
		System.out.println("5|6="+leftshift);
		int zerofillrightshift=binary.zerofillrightshift(5, 6);
		System.out.println("5|6="+zerofillrightshift);
		
		
		GenericsMethods method=new GenericsMethods();
		String[] array={"Hello","World","My name","Is","Rishi"};
		method.PrintArray(array);
	}

}
