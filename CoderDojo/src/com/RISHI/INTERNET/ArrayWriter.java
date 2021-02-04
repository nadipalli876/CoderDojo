package com.RISHI.INTERNET;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArrayWriter {

	public static void main(String[] args) throws IOException {
		String[] array = {"Hi","Rishi","but","bye"} ;
		FileWriter fw = new FileWriter("Test.txt");
		BufferedWriter writer=new BufferedWriter(fw);
		for(String i:array) {
			writer.write(i+",");
			System.out.println("writing okay");
			
		}
		writer.close();
		
		
	}
	
	
}


