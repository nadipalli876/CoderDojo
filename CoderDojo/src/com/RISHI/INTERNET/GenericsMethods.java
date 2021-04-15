package com.RISHI.INTERNET;

public class GenericsMethods {

	public <T> void PrintArray(T[]array) {
		for(T item:array) {
			System.out.print(item+" ---> ");
		}
		
	}

}
