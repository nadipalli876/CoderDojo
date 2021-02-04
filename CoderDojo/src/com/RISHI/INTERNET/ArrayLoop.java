package com.RISHI.INTERNET;

import java.util.Scanner;

public class ArrayLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String valueCheck=scan.nextLine();
		String[] array = {"Hi","Rishi","but","bye"} ;
		int numberOfTimesRun=array.length;
		boolean found= false;
		//loop with out int index
		for(String i:array) {
			if(valueCheck.equals(i)) {
				found=true;
			}
		}if(found) {
			System.out.println(valueCheck+" is found");
		}else {
			System.out.println(valueCheck+" is not found");
		}
		//loop with int index
		for(int i=0;i<array.length;i++) {
			if(valueCheck.equals(array[i])) {
				found=true;
			}
		}if(found) {
			System.out.println(valueCheck+" is found");
		}else {
			System.out.println(valueCheck+" is not found");
		}
		
	}

}
